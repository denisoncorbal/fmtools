
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
                  credentialsId: 'fmtools-env',
                  variable: 'ENV_FILE'
                ),
                file(
                    credentialsId: 'fmtools-frontend-env',
                    variable: 'FRONTEND_ENV_FILE'
                ),
                file(
                    credentialsId: 'fmtools-backend-env',
                    variable: 'BACKEND_ENV_FILE'
                ),
                string(
                    credentialsId: 'fmtools-postgres-password',
                    variable: 'POSTGRES_PASSWORD'
                )
              ]) {
                sh '''
                    set -eu

                    umask 077

                    rm -f .env
                    rm -f frontend.env
                    rm -f backend.env
                    rm -rf ./secrets

                    mkdir secrets

                    cp "$ENV_FILE" .env
                    cp "$FRONTEND_ENV_FILE" frontend.env
                    cp "$BACKEND_ENV_FILE" backend.env
                    set +x
                    printf '%s' "$POSTGRES_PASSWORD" > ./secrets/postgres_password.txt

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
