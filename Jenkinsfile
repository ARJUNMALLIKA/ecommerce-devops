pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Maven Build') {
            steps {
                sh './mvnw -B clean package'
            }
        }

        stage('Test') {
            steps {
                sh './mvnw -B test'
            }
        }
    }
}
