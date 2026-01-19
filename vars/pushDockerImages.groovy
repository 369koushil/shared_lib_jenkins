def call(String DOCKER_USERNAME,String imgName){
    echo "starting pushing images to hub"
    sh "docker push ${DOCKER_USERNAME}/${imgName}"
    echo "completed pushing images to hub"
}