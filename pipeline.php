pipeline {
    agent any
    stages{
        stage('build'){
            steps {
                echo "checkout stage"
                sleep 10
            }
        }
    }
}