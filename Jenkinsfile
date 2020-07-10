

properties([
        parameters([

             
                string(defaultValue: '',  name: 'stageStatus')
        ])
])


String[] stages = stageStatus.split(";")


node{ 
      

        stage('Build') {          
              checkout scm
            
       

             print stages
              for(int i=0;i<stages.length;i++){
                            String[] pipelineStages = stages[i].split(":")
                      print pipelineStages[0]
              }
             
              

   
       
          
         
           }
   
           
      
}    

