pipeline {
    agent none
    stages {
        stage('Checkout') {
            agent {
                lable 'slave2'
            }
            steps {
                echo 'this is the first build'
                sleep 20
            }
        }
        stage ('build') {
            agent {
                lable 'slave1'
            }
            steps {
                echo 'this is the build stage'
                sleep 5
            }
        }
    
    }
}
