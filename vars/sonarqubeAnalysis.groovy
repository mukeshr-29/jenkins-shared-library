def call() {
    withSonarQubeEnv('sonarqube') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=youtube-project -Dsonar.projectKey=youtube-project '''
    }
}