def call(){
    withKubeConfig(caCertificate: '', clusterName: '', contextName: '', credentialsId: 'k8s', namespace: '', restrictKubeConfigAccess: false, serverUrl: ''){
        sh 'kubectl apply -f deployment.yml'
        sh 'kubectl apply -f service.yml'
    }
}