def call(String dockerHubUsername, String imageName) {
    // Build the Docker image
    sh "docker build --build-arg REACT_APP_RAPID_API_KEY=4c1d84d38dmshf751638cad6fea5p155b7fjsn32eef799f8a6 -t ${imageName} ."
     // Tag the Docker image
    sh "docker tag ${imageName} ${dockerHubUsername}/${imageName}:latest"
    // Push the Docker image
    withDockerRegistry([url: 'https://index.docker.io/v1/', credentialsId: 'dockerhub']) {
        sh "docker push ${dockerHubUsername}/${imageName}:latest"
    }
}