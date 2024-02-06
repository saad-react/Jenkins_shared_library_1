def call() {
    sh 'trivy image 797272/youtube:latest > trivyimage.txt'
}
