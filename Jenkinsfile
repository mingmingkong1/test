properties([
        parameters([
              
                string(defaultValue: 'kong', description: '',name: 'user', trim: false)

           ])
])


node{ 

        stage('Build') {          
              checkout scm
              withCredentials([string(credentialsId: password, variable: 'password')]) {  
              def kong=load("abc.groovy")
                kong.test()
       
          
                } 
}
   
           
      
        
}
