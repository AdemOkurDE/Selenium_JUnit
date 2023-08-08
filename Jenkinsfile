pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Adm'
      }
    }

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

    stage('End') {
      steps {
        echo 'The End'
      }
    }

  }
}