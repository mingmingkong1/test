properties([
        parameters([
              
                string(defaultValue: 'kong', description: '',name: 'user', trim: false)
           ])
])


node{ 

        stage('Build') {          
              checkout scm
          
       
                sh " cat ${WORKSPACE}/scripta.sh"
                sh "chmod 777 ${WORKSPACE}/scripta.sh"
                echo params.user
                sh "${WORKSPACE}/scripta.sh"
          
                } 

              
                sh 'pwd' 
                sh 'ls -al'
                
           
      
        
}
