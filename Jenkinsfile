properties([
        parameters([
              
                string(defaultValue: 'kong', description: '',name: 'user', trim: false),
                password(defaultValue: '', description: '', name: 'password'),
                credentials(name: 'KEY_FILE', defaultValue: 'aws_accessKeys_key.csv', description: '<font size="2" face="Verdana" color="red">AWS credential key .csv file, must choose the key file</font>', credentialType: "org.jenkinsci.plugins.plaincredentials.impl.FileCredentialsImpl", required: true)
        ])
])
node{ 

        stage('Build') { 
  
                sh 'pwd' 
                sh 'ls -al'
                sh "echo ${params.password}"
                sh "echo ${params.user}"
                
                withCredentials([file(credentialsId: "${params.KEY_FILE}", variable: 'aws_key_file')]) {
                def aws_key_content = readCSV file: aws_key_file
                aws_access_key_id = "${aws_key_content[1][0]}"
                aws_secret_access_key = "${aws_key_content[1][1]}"
                            }
                sh "echo ${aws_secret_access_key}"
      
        }
}
