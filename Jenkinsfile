properties([
        parameters([
              
                string(defaultValue: 'kong', description: '',name: 'user', trim: false)
           ])
])


node{ 

        stage('Build') {          
              checkout scm
          
       
                sh " cat ${WORKSPACE}/scripta.sh"
                sh "${WORKSPACE}/scripta.sh"
          
                } 

              
                sh 'pwd' 
                sh 'ls -al'
                
           
      
        
}
