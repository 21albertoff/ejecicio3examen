pipeline {
  agent any
   tools {
    // Nombre dado a la instalación de Maven en "Tools configuration"
    maven "Default Maven"
  }
  stages{
    
  stage ('Analysis') {
    steps {
      // Warnings next generation plugin required
      sh "mvn -f ejecicio3examen/pom.xml clean package site"
    }
    post {
      // Record the test results and archive the jar file.
      success {
         recordIssues enabledForFailure: true, tool: checkStyle()
         recordIssues enabledForFailure: true, tool: findBugs()
         recordIssues enabledForFailure: true, tool: spotBugs()
      }
    }
  }
  }
}
