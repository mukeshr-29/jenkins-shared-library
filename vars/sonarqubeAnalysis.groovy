def call() {
    withSonarQubeEnv('sonarqube') {
        sh ''' $SCANNER_HOME/bin/sonarqube -Dsonar.projectName=youtube-project -Dsonar.projectKey=youtube-project '''
    }
}