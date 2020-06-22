withCredentials([string(credentialsId: passwords, variable: 'password')]) {
def test(){
    echo "the password is  ${password}"
}

return this
}
