pipeline {
    agent any
    tools  {
        jdk "JDK8"
    }
    stages {
        stage('Compile Stage') {
            steps {
                withMaven(maven: 'maven_3.8.1') {
                    bat 'mvn clean compile'
                }
            }
        }
        stage('Testing Stage') {
            steps {
                withMaven(maven: 'maven_3.8.1') {
                    bat 'mvn test'
                }
            }
        }
        stage('Deployment Stage') {
            steps {
                withMaven(maven: 'maven_3.8.1') {
                    bat 'mvn deploy'
                }
            }
        }
    }
}