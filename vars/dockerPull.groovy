def pullingDockerImages(String image,String version="latest"){
    echo "starting pulling images"
    sh "docker pull ${image}:${version}"
    echo "completed pulling images"
}