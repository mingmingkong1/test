properties([
        parameters([
              
                string(defaultValue: 'kong', description: '',name: 'user', trim: false),
                password(defaultValue: '', description: '', name: 'password')
        ])
])
pipeline { 
    agent any 

    stages {
        stage('Build') { 
            steps { 
                sh 'pwd' 
                sh 'ls -al'
                sh "echo $param.password"
                sh "echo $param.username"
            }
        }
        
    }
}
