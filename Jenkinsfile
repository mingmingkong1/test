properties([
        parameters([
              
                string(defaultValue: 'kong', description: '',name: 'user', trim: false)

           ])
])


node{ 

        stage('Build') {          
              checkout scm
              def kong=load("abc.grovvy")
                kong.test()
       
          
                } 

   
           
      
        
}
