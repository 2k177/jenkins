pipeline {
    agent any
     parameters {
        string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet the world?')
    }
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
                echo "${params.Greeting} World!"
            }
        }
    }
}
