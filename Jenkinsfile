pipeline {
  agent any
  stages {
    stage('start') {
      steps {
        echo 'Start stage inititated'
      }
    }

    stage('build') {
      parallel {
        stage('build1') {
          steps {
            echo 'Build1 step running ....'
          }
        }

        stage('build2') {
          steps {
            sleep 10
          }
        }

      }
    }

    stage('test') {
      steps {
        bat(script: 'echo "Testing in progress"', returnStdout: true, returnStatus: true)
      }
    }

    stage('deploy') {
      steps {
        echo 'All the test case is passed...Deployyy'
      }
    }

  }
}