pipeline {
    agent any
    options {
                timeout(time: 5, unit: 'SECONDS') 
            }
    stages {
        stage('Example') {
            options {
                timeout(time: 3, unit: 'SECONDS') 
                timestamps()
            }
            steps {
                echo 'Hello World'
            }
        }
    }
}
