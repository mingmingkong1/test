

node{ 

        stage('Build') {          
              checkout scm
              withCredentials([string(credentialsId: 'kongmingpassword', variable: 'KONGPASSWORD')]) {
                  sh """
                  sshpass -p ${KONGPASSWORD} ssh -o StrictHostKeyChecking=no root@15.119.88.51 "ls -al"
                  """
              
              }
              

   
       
          
         
           }
   
           
      
}    

