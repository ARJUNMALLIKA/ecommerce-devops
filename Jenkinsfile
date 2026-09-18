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

        stage('Docker Build') {
            steps {
                sh 'docker build -t mallikarjun147/ecommerce-app:1.0 .'
            }
        }

        stage('Docker Push') {
            steps {
                sh 'docker push mallikarjun147/ecommerce-app:1.0'
            }
        }
    }
}
