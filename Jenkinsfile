

properties([
        parameters([
               file(description: 'Self-signed certification file', name: 'CERT_FILE'),
             
                string(defaultValue: '', description: 'input the git repo you want to create branch or create tag, like git@github.houston.softwaregrp.net:northstar/dnd.git ', name: 'ssh_git_repo')
        ])
])
node{ 

        stage('Build') {          
              checkout scm
            
              def workdir = "${env.WORKSPACE}"
               def ll =  workdir.tokenize('/')[-1]
                println ll
              def certificate_file = unstashParam "CERT_FILE"
                        sh("cp -f ${certificate_file} /app/keys/cert.pfx")
                        sh("rm -rf ${certificate_file}")
                
              echo "1111111111111111111111111111"
                if(${certificate_file} != null ){
                                echo "uploaded"
               }else{
                 echo "no file"
               }
              
              def kongconfig = load("abc.groovy")
              withCredentials([string(credentialsId: 'kongmingpassword', variable: 'KONGPASSWORD')]) {
                  kongconfig.test()
                      
                  sh """
                  sshpass -p ${KONGPASSWORD} ssh -o StrictHostKeyChecking=no root@15.119.88.51 "ls -al"
                 
                  """
                      if (params.ssh_git_repo){
                              echo params.ssh_git_repo
                      }else{
                              echo"ddddddddddd"
                      }
              
              }
              

   
       
          
         
           }
   
           
      
}    

