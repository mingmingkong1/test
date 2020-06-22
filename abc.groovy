def test(){
withCredentials([string(credentialsId: passwords, variable: 'password')]) {
    echo "the password is  ${password}"
}

return this
}
