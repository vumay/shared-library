#!/usr/bin/env groovy

def call() {
   sh 'docker-compose -f \${WORKSPACE}/docker-compose.yml config'
   sh 'hadolint \${WORKSPACE}/fake-backend/Dockerfile'
   sh 'hadolint \${WORKSPACE}/fake-backend/main.go'
