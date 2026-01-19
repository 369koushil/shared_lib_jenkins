def call(String DOCKER_USERNAME,String imgName,String context="."){
    echo "starting building images"
    sh "docker build -t ${DOCKER_USERNAME}/${imgName} ./${context}"
    echo "completed building images"
}