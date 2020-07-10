

properties([
        parameters([
               file(description: 'Self-signed certification file', name: 'CERT_FILE'),
             
                string(defaultValue: '',  name: 'stageStatus')
        ])
])
def version_list = ["2019.08","2019.11","2020.02"]

String[] stages = stageStatus.split(";")

def lista(testlist){
        def testkong=[]
        for(i in testlist){
               
                testkong.add(i)
        }
        return testkong
}
node{ 
      

        stage('Build') {          
              checkout scm
            
              def workdir = "${env.WORKSPACE}"

              echo "1111111111111111111111111111"
             print stages
              
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

