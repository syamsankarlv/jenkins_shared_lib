def call(credentialsId){
   
  withSonarQubeEnv(credentialsId: credentialsId) {
     sh 'mvn clean verify sonar:sonar -Dsonar.login=squ_1b8038d874ee416167d6f185410415112b02ba5d'
  }

}

