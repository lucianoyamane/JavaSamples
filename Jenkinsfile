pipeline {
  agent any
  stages {
    stage('Git') {
      steps {
        git(url: 'https://github.com/lucianoyamane/JavaSamples', changelog: true)
      }
    }
  }
}