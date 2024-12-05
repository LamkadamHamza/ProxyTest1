pipeline {
    agent any
    tools {
        maven 'maven'
        nodejs 'node'
    }
    stages {
        stage ("Clean up"){
            steps {
                deleteDir()
            }
        }
        stage ("Clone repo"){
            steps {
                sh "git clone https://github.com/LamkadamHamza/ProxyTest1.git"
            }
        }
        stage ("Generate frontend image") {
            steps {
                 dir("ProxyTest1/ProxyFrontEnd"){
                    sh "docker build -t ProxyFrontEnd ."
                }
            }
        }
        stage ("Generate backend image") {
              steps {
                   dir("ProxyTest1/ProxyBackend"){
                      sh "mvn clean install"
                      sh "docker build -t ProxyBackend ."
                  }
              }
          }
        stage ("Run docker compose") {
            steps {
                 dir("ProxyTest1"){
                    sh " docker-compose up -d"
                }
            }
        }
    }
}
