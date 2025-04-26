pipeline {
    agent any
    stages{
        stage('checkout'){
            steps {
                echo "checkout stage"
                sleep 10
            }
        }
    stages {
        stage('build'){
            steps {
                echo 'this is build stage'
            }
        }
    }
    }
}