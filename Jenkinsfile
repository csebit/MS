pipeline{
  agent any

  tools{
    maven 'Maven'
  }

  stages{
    stage('Checkout'){
      steps{
        git branch:'master',url:'https://github.com/csebit/MS.git'
      }
    }
    stage('Build'){
      steps{
        sh 'mvn clean package'
      }
    }
    stage('Test'){
      steps{
        sh 'mvn test'
      }
    }
    stage('Run Application'){
      steps{
        sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
      }
    } 
  }

  post{
    success{
      echo 'done'
    }
    failure{
      echo 'fail'
    }
  }
}
