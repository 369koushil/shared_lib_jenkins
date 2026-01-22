# Jenkins Shared Library for Docker CI/CD

This repository contains a **Jenkins Shared Library** used to standardize and reuse common CI/CD logic across multiple Jenkins pipelines.

The library is focused on **Docker-based workflows**, helping keep Jenkinsfiles clean, secure, and easy to maintain.

---

## Purpose

The shared library centralizes repetitive pipeline logic such as:
- Docker authentication
- Docker image build
- Docker image push

Instead of duplicating this logic in every Jenkinsfile, pipelines simply call reusable library functions.

---

## Features

- Secure Docker Hub login using Jenkins credentials
- Reusable Docker build functions
- Reusable Docker push functions
- No credentials hardcoded in pipelines
- Cleaner and more readable Jenkinsfiles

---

## Usage in Jenkinsfile

```groovy
@Library('shared_lib_jenkins') _

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                buildDockerImages("username", "frontend", "frontend")
            }
        }

        stage('Push') {
            steps {
                dockerLogin('docker-hub-creds')
                pushDockerImages("username", "frontend")
            }
        }
    }
}
