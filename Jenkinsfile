pipeline {
    agent {
        label 'jenkins-agent-bullseye'
    }

    environment {
        TZ = 'Europe/Moscow'
    }

    tools {
        jdk 'oracle-jdk21'
        maven 'Maven 3.9.5'
    }
    
    options {
        ansiColor('xterm')
        timestamps()
    }

    stages {
        stage('Build') {
            steps {
                script {
                    def container_tag = env.GIT_URL =~ /^https:\/\/([\w\.\/\-_]+)\.git$/
                    if (!container_tag.matches()) {
                      currentBuild.result = 'ABORTED'
                      error('failed to determinate container tag')
                    }
                    env.CONTAINER_TAG = container_tag[0][1]

                    def git_registry = env.GIT_URL =~ /^(https?:\/\/[\w\d\.]+).+$/
                    if (!git_registry.matches()) {
                      currentBuild.result = 'ABORTED'
                      error('failed to determinate git registry')
                    }
                    env.GIT_REGISTRY = git_registry[0][1]

                    def docker_service = env.JOB_NAME =~ /^.+\/(.+)-([\w_]+)\/.+$/
                    if (!docker_service.matches()) {
                      currentBuild.result = 'ABORTED'
                      error('failed to determinate docker service')
                    }

                    env.DOCKER_SERVICE = docker_service[0][2]
                    env.DEPLOYMENT_WORKDIR = docker_service[0][1] + '-' + env.GIT_BRANCH
                }

                sh 'mvn package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t $CONTAINER_TAG:$GIT_BRANCH .'
            }
        }

        stage('Docker Push') {
            steps {
                withDockerRegistry([ credentialsId: "fecff396-4934-41d5-9cc5-a179746b52c2", url: env.GIT_REGISTRY ]) {
                    sh 'docker push $CONTAINER_TAG:$GIT_BRANCH'
                }
            }
        }

//        stage('Deployment') {
//            steps {
//                git credentialsId: 'fecff396-4934-41d5-9cc5-a179746b52c2', url: 'https://git.aispm.ttk.ru/ttk/ansible.git'
//                ansiblePlaybook credentialsId: '588bd061-af7c-4332-8565-80952c8effc5', inventory: 'inventories/lk/' + env.GIT_BRANCH, playbook: 'lk.yml', extraVars: [service_name: env.DOCKER_SERVICE], colorized: true
//            }
//        }
    }
}