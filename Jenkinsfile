
pipeline {
    agent {
        label 'docker'
    }

    options {
        timestamps()
        disableConcurrentBuilds()
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Validar ambiente') {
            steps {
                sh '''
                    set -eu

                    echo "Verificando Docker..."
                    docker --version
                    docker compose version

                    echo "Validando arquivo Compose..."
                    docker compose config -q
                '''
            }
        }

        stage('Deploy') {
            steps {
              withCredentials([
                file(
                  credentialsId: 'fmtools-env-file',
                  variable: 'ENV_FILE'
                )
              ]) {
                sh '''
                    set -eu

                    umask 077
                    cp "$ENV_FILE" .env

                    echo "Atualizando containers..."
                    docker compose up -d --build --remove-orphans

                    echo "Containers em execução:"
                    docker compose ps
                '''
              }
            }
        }
    }

    post {
        success {
            echo 'Deploy concluído com sucesso!'
        }

        failure {
            echo 'Falha no pipeline. Consulte os logs.'
        }
    }
}
