pipeline { 
    agent any 
    environment { 
        DOCKER_IMAGE_NAME = 'scientific-calculator' 
        GITHUB_REPO_URL = 'https://github.com/parandeyash-sys/Mini-Project-SPE.git' 
        DOCKER_HUB_USERNAME = 'yash140603' 
        DOCKER_HOST = "unix:///Users/rahulraman/.docker/run/docker.sock" 
    } 
    tools{ 
        maven 'Maven-3' 
    } 
    stages { 
        stage('Clone Git') { 
            steps { 
                script { 
                    git branch: 'main', 
                        credentialsId: 'github_credentials', 
                        url: "${GITHUB_REPO_URL}" 
                } 
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
        stage('Verify JAR Existence') { 
            steps { 
                sh 'ls -lh target/'   // Check if the JAR file is actually created 
            } 
        } 
        stage('Build and Push Docker Image') { 
            steps { 
                script { 
                    sh """ 
                    docker buildx create --use || true
                    docker buildx inspect --bootstrap
                    docker buildx build \\
                      --platform linux/amd64,linux/arm64 \\
                      -t ${DOCKER_HUB_USERNAME}/${DOCKER_IMAGE_NAME}:latest \\
                      --push .
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
                subject: " Build Successful: ${env.JOB_NAME} #${env.BUILD_NUMBER}", 
                body: "Build completed successfully.\n${env.BUILD_URL}", 
                to: "parandeyash@gmail.com" 
            ) 
        } 
        unstable { 
            emailext ( 
                subject: " UNSTABLE Build: ${env.JOB_NAME} #${env.BUILD_NUMBER}", 
                body: "Build is unstable.\n${env.BUILD_URL}", 
                to: "parandeyash@gmail.com" 
            ) 
        } 
        failure { 
            emailext ( 
                subject: " Build Failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}", 
                body: "Build failed.\n${env.BUILD_URL}", 
                to: "parandeyash@gmail.com" 
            ) 
        } 
    } 
}
