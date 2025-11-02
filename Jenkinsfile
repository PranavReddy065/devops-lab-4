pipeline {
    agent any

    stages {
        stage('Build Hello App') {
            steps {
                echo "Building Hello App..."
                sh 'mvn -f hello-app/pom.xml clean compile -DskipTests'
            }
        }

        stage('Test Hello App') {
            steps {
                echo "Running Tests..."
                sh 'mvn -f hello-app/pom.xml test'
            }
        }
    }

    post {
        success {
            echo '✅ Build & Tests completed successfully!'
        }
        failure {
            echo '❌ Pipeline failed!'
        }
    }
}
