pipeline {
    agent none

    stages {
        stage('Build Hello App') {
            agent { label 'build-node' }
            steps {
                echo "Building Hello App on Build Node..."
                sh 'mvn -f hello-app/pom.xml clean compile -DskipTests'
            }
        }

        stage('Test Hello App') {
            agent { label 'test-node' }
            steps {
                echo "Running Tests on Test Node..."
                sh 'mvn -f hello-app/pom.xml test'
            }
        }
    }

    post {
        success {
            echo 'Build & Tests completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
