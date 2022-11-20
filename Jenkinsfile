pipeline {
    agent any
    environment { 
        CC = 'clang'
    }
    stages {
        stage('Example') {
            environment { 
                DEBUG_FLAGS = '-g'
            }
            steps {
                echo "Example stage ........"
                environment{
                DANUU_ID = credentials('danuu_id')
                }
                echo '${DANUU_ID} : danuu creds'
            }
        }
    }
}
