pipeline {
  agent any
  stages {
    stage('Test') {
      parallel {
        stage('Test') {
          steps {
            echo 'test ok'
          }
        }

        stage('Error') {
          steps {
            echo 'Error'
          }
        }

      }
    }

  }
}