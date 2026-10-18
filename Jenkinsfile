
pipeline {
    agent any

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

                    rm -f .env
                    cp "$ENV_FILE" .env

                    echo "Validando arquivo Compose..."
                    docker compose config -q

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
