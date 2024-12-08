pipeline {
    agent any
    tools {
        maven 'maven'
        nodejs 'node'
    }
    stages {
        stage ("Clean up") {
            steps {
                deleteDir()
                sh "docker system prune -f"
            }
        }
        stage ("Clone repo") {
            steps {
                sh "git clone https://github.com/LamkadamHamza/ProxyTest1.git"
            }
        }
        stage ("Generate frontend image") {
            steps {
                dir("ProxyTest1/ProxyFrontEnd") {
                    sh "npm install --legacy-peer-deps"
                    sh "npm run build --force || (echo 'Angular build failed'; exit 1)"
                    sh "ls -la dist/ProxyFrontEnd"
                    sh "docker build -t proxyfrontend ."
                }
            }
        }
        stage ("Generate backend image") {
            steps {
                dir("ProxyTest1/ProxyBackend") {
                    sh "mvn clean install"
                    sh "docker build -t proxybackend ."
                }
            }
        }
        stage ("Run docker compose") {
            steps {
                dir("ProxyTest1") {
                    sh "docker-compose up -d"
                }
            }
        }
    }
}
