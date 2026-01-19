def dockerCompose(){
    ech "exec docker compose up cmd"
    sh "docker compose up --build"
}