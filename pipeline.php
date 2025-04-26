pipeline {
    agent any
    stages{
        stage('checkout'){
            steps {
                echo "checkout stage"
                sleep 10
            }
        }
        stage ('build'){
            steps {
                echo 'checkout build'
            }
        }
    }
}