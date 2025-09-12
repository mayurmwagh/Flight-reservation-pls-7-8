pipeline{
    agent any 
    stages{
        stage('Pull'){
            step{
                git branch: 'main', url: 'https://github.com/mayurmwagh/Flight-reservation-pls-7-8.git'
            }
        }
    }
}