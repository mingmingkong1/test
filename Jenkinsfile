properties([
        parameters([
              
                string(defaultValue: 'kong', description: '',name: 'user', trim: false),
                password(defaultValue: 'null', description: '', name: 'password'),
                //nonStoredPasswordParam(description: '', name: 'password'),
                string(defaultValue: '114706266704.dkr.ecr.us-west-2.amazonaws.com', description: '',name: 'ecr_uri', trim: false),
                credentials(credentialType: 'com.cloudbees.plugins.credentials.impl.UsernamePasswordCredentialsImpl', defaultValue: '83ecbcda-8918-4e88-b90e-664c21ff0829', description: '', name: 'kongkey', required: false),
                credentials(name: 'KEY_FILE', defaultValue: 'aws_accessKeys_key.csv', description: '<font size="2" face="Verdana" color="red">AWS credential key .csv file, must choose the key file</font>', credentialType: "org.jenkinsci.plugins.plaincredentials.impl.FileCredentialsImpl", required: true)
        ])
])


node{ 

        stage('Build') {          
                wrap([$class: 'MaskPasswordsBuildWrapper', varPasswordPairs: [[password: password, var: 'password']]]) {}
          
       
         

              
                sh 'pwd' 
                sh 'ls -al'
                
           
      
        }
}
