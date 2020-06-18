properties([
        parameters([
              
                string(defaultValue: 'kong', description: '',name: 'user', trim: false),
                file(description: '', name: 'mmmmm.json')

           ])
])


node{ 

        stage('Build') {          
              checkout scm
          
       
                sh """echo  ${WORKSPACE}
                    cd ${WORKSPACE}
                    pwd
                """
                
                sh "chmod 777 ${WORKSPACE}/scripta.sh"
                echo params.user
               
          
                } 

              
                sh 'pwd' 
                sh 'ls -al'
                
           
      
        
}
