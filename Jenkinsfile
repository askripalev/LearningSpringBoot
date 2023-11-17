pipeline {
    agent {
        label 'jenkins-agent-bullseye'
    }

    environment {
        TZ = 'Europe/Moscow'
    }

//    tools {
//        jdk 'oracle-jdk21'
//        maven 'Maven 3.9.5'
//    }
    
    options {
        ansiColor('xterm')
        timestamps()
    }

    stages {
        stage('Build') {
            steps {
                sh 'printenv'

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

                sh 'printenv'
            }
        }

//        stage('Docker Build') {
//            steps {
//                sh 'docker build -t $CONTAINER_TAG:$GIT_BRANCH .'
//            }
//        }
    }
}