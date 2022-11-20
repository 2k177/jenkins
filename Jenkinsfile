pipeline {
    agent any
    environment { 
        CC = 'clang'
    }
    stages {
        stage('Example') {
            environment { 
                DEBUG_FLAGS = '-g'
                DANUU_ID = credentials('danuu_id')
            }
            steps {
                echo "Example stage ........"
                echo '${DANUU_ID} : danuu creds'
            }
        }
    }
}
