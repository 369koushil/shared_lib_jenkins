def call(String url, String branch) {
    echo "Initializing GitHub repository cloning"
    sh "git clone -b ${branch} ${url}"
    echo "Cloning completed"
}


