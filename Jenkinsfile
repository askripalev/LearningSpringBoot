pipeline {
    agent {
        label 'jenkins-agent-bullseye'
    }

    environment {
        TZ = 'Europe/Moscow'
    }

    tools { 
        maven 'Maven 3.9.5' 
        jdk 'jdk21' 
    }
    
    options {
        ansiColor('xterm')
        timestamps()
    }

    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "JAVA_HOME = ${JAVA_HOME}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }

        stage ('Build') {
            steps {
                echo 'This is a minimal pipeline.'
            }
        }
    }
}