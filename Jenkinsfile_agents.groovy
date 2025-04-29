pipeline {
    agent none
    stages {
        stage('Checkout') {
            agent {
                label 'slave2'
            }
            steps {
                echo 'this is the first build'
                sleep 4
            }
        }
        stage ('build') {
            agent {
                label 'slave1'
            }
            steps {
                echo 'this is the build stage'
                sleep 5
            }
        }

        stage('parallel testing'){
            parallel {
                stage ('test1') {
                    agent {
                        label 'slave1'
                    }
                    steps {
                        echo 'this is the test1 stage'
                        sleep 5
                        sh 'ls -ltr'
                    }
                }
                stage ('test2') {
                    agent {
                     label 'slave1'
                    }
                    steps {
                        echo 'this is the test2 stage'
                        sleep 10
                        sh '''
                        pwd
                        '''
     
                    }
                }
        
        
            }
        }
    
    }
}
