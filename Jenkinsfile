properties([
        parameters([
              
                string(defaultValue: 'kong', description: '',name: 'user', trim: false),
                password(defaultValue: '', description: '', name: 'password')
        ])
])
node{ 

    stages {
        stage('Build') { 
  
                sh 'pwd' 
                sh 'ls -al'
                sh "echo params.password"
                sh "echo params.username"
      
        }
        
    }
}
