def test(){
   sh """
    sshpass -p ${KONGPASSWORD} ssh -o StrictHostKeyChecking=no root@15.119.88.51 "pwd"
    """
}

return this;
}
