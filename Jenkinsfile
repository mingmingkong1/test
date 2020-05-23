pipeline { 
    agent any 

    stages {
        stage('Build') { 
            steps { 
                sh 'pwd' 
                sh 'ls -al'
                sh "cd ../${kongaccess}"
                sh "cat ${kongaccess}"
            }
        }
        
    }
}
