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

//ecr = params.ecr_uri
 
ecr_region = params.ecr_uri.split("\\.")[3]

node{ 

        stage('Build') {          
                wrap([$class: 'MaskPasswordsBuildWrapper', varPasswordPairs: [[password: password, var: 'password']]]) {}
          
       
         

                
                sh "echo $ecr_region"
                sh 'pwd' 
                sh 'ls -al'
                //sh(script:"#!/bin/sh -e\ncd ${terraform_location} && sed -i s/{{AWS_SECRET_ACCESS_KEY}}/${aws_secret_key}/ providers.tf", returnStatus:true)
                sh(script:"#!/bin/sh -e\n echo ${params.password}")
                sh "echo ${params.user}"
                
                withCredentials([file(credentialsId: "${params.KEY_FILE}", variable: 'aws_key_file')]) {
                def aws_key_content = readCSV file: aws_key_file
                aws_access_key_id = "${aws_key_content[1][0]}"
                aws_secret_access_key = "${aws_key_content[1][1]}"
                            
                sh "echo ${aws_secret_access_key}"
                }
                environment { 
                AN_ACCESS_KEY = credentials('kongkey')
             
                }
                sh "printenv"
                        
           
      
        }
}
