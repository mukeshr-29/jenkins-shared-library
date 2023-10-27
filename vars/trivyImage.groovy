def call() {
    sh 'trivy image mukeshr29/youtube-project:latest > trivyimage.txt'
}