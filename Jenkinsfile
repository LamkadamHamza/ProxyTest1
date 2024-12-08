pipeline {
    agent any
    tools {
        nodejs 'node'
    }
    stages {
        stage ("Clean Workspace") {
            steps {
                deleteDir()
            }
        }
        stage ("Clone Repository") {
            steps {
                sh "git clone https://github.com/LamkadamHamza/ProxyTest1.git"
            }
        }
        stage ("Check Node.js Version") {
            steps {
                dir("ProxyTest1/ProxyFrontEnd") {
                    sh "node -v"
                    sh "npm -v"
                }
            }
        }
        stage ("Install Dependencies") {
            steps {
                dir("ProxyTest1/ProxyFrontEnd") {
                    sh "npm install --legacy-peer-deps"
                }
            }
        }
        stage ("Build Angular") {
            steps {
                dir("ProxyTest1/ProxyFrontEnd") {
                    retry(3) {
                        sh "npm run build --force"
                    }
                }
            }
        }
        stage ("Build Docker Image") {
            steps {
                dir("ProxyTest1/ProxyFrontEnd") {
                    sh "docker build -t proxyfrontend ."
                }
            }
        }
    }
}
