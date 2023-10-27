def call(){
    withKubeConfig(caCertificate: '', clusterName: '', contextName: '', credentialsId: 'k8s', namespace: '', restrictKubeConfigAccess: false, serverUrl: ''){
        sh 'kubectl delete -f deployment.yml'
        sh 'kubectl delete -f service.yml'
    }
}