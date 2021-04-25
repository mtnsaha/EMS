pipeline {
        agent any
        stage ('Compile Stage'){
        stages{
        steps{
            withMaven(maven : 'maven_3.8.1'){
                sh 'mvn clean compile'
            }
        }
        }


        stage ('Testing Stage'){
                steps{
                    withMaven(maven : 'maven_3.8.1'){
                        sh 'mvn test'
                    }
                }
                }

                 stage ('Deployment Stage'){
                                steps{
                                    withMaven(maven : 'maven_3.8.1'){
                                        sh 'mvn deploy'
                                    }
                                }
                                }
                                }

}