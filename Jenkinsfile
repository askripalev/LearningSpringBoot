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
        stage ('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}