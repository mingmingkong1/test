def test(){
    withCredentials([string(credentialsId: password, variable: 'password')]) {
    echo "the password is  ${password}"
}

return this
}
