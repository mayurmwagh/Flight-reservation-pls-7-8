pipeline{
    agent any 
    stages{
        stage('Pull'){
            steps{
                git branch: 'main', url: 'https://github.com/mayurmwagh/Flight-reservation-pls-7-8.git'
            }
        }
    }
}