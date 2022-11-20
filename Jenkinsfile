pipeline {
    agent any
    
    stages {
        stage('Example stage 1') {
            environment {
                KEY_ID= credentials('danuu_id')
                }
            steps {
                echo "Creds: $KEY_ID"
            }
        }
        stage('Example stage 2') {
            steps {
                echo "Example stage 2"
            }
        }
    }
}
