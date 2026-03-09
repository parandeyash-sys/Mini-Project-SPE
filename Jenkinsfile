pipeline {
    agent any

    environment {
        DOCKER_IMAGE_NAME = 'scientific-calculator'
        GITHUB_REPO_URL = 'https://github.com/parandeyash-sys/Mini-Project-SPE.git'
        DOCKER_HUB_USERNAME = 'yash140603'
    }

    tools {
        maven 'Maven-3.8'
    }

    stages {

        stage('Clone Git') {
            steps {
                git branch: 'main',
                    credentialsId: 'github_credentials',
                    url: "${GITHUB_REPO_URL}"
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Verify JAR') {
            steps {
                sh 'ls -lh target/'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh """
                docker build -t ${DOCKER_HUB_USERNAME}/${DOCKER_IMAGE_NAME}:latest .
                """
            }
        }

        stage('Push Docker Image') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub_credentials', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                    sh """
                    echo $PASS | docker login -u $USER --password-stdin
                    docker push ${DOCKER_HUB_USERNAME}/${DOCKER_IMAGE_NAME}:latest
                    """
                }
            }
        }

        stage('Deploy with Ansible') {
            steps {
                sh 'ansible-playbook -i inventory.ini deploy.yml'
            }
        }
    }

    post {

        success {
            emailext (
                subject: "Build Successful: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: "Build completed successfully.\n${env.BUILD_URL}",
                to: "parandeyash@gmail.com"
            )
        }

        failure {
            emailext (
                subject: "Build Failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: "Build failed.\n${env.BUILD_URL}",
                to: "parandeyash@gmail.com"
            )
        }
    }
}
