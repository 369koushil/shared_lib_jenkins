def buildDockerImages(String DOCKER_USERNAME,String imgName){
    echo "starting building images"
    sh "docker build -t ${DOCKER_USERNAME}/{imgName} ."
    echo "completed building images"
}