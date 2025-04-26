boolean runBuild=true
pipeline {
    agent any
    stages{
        stage('checkout'){
            if (runBuild)
            steps {
                echo "checkout stage"
                sleep 10
            }
            runBuild=false
        }
        stage ('build'){
            steps {
                echo 'checkout build'
            }
        }
        stage ('deploy'){
            steps {
                echo 'checkout deploy'
            }
        }
    }
}