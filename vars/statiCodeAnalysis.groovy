def call(credentialsId){
   
  withSonarQubeEnv(credentialsId: credentialsId) {
     sh 'mvn clean package sonar:sonar \
  -Dsonar.projectKey=Java-project \
  -Dsonar.host.url=http://54.173.70.205:9000 \
  -Dsonar.login=squ_1b8038d874ee416167d6f185410415112b02ba5d'
  }

}

