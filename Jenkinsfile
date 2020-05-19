#!/usr/bin/env groovy
def gitConfigNameAndEmail(String name, String email) {
    sh """
    git config --global user.name ${name}
    git config --global user.email ${email}
   """
}

def checkoutCode(String url, boolean force, String branch, String credentialsId) {
    gitConfigNameAndEmail('mingmingkong1', 'kongmingming2007@126.com')
    if (force) {
        deleteDir()
    }
    checkout([
            $class                           : 'GitSCM',
            branches                         : [[name: branch]],
            doGenerateSubmoduleConfigurations: false,
            extensions                       : [
                    [$class: 'CheckoutOption', timeout: 60],
                    [$class: 'PruneStaleBranch']
            ],
            submoduleCfg                     : [],
            userRemoteConfigs                : [
                    [credentialsId: credentialsId,
                     url          : url,
                     refspec      : '+refs/pull/*:refs/remotes/origin/pr/*'
                    ]
            ]
    ])
}

def getRepoURL(repository) {
    switch (repository.toLowerCase()) {
        case ~/.*test.*/:
            return "https://github.com/mingmingkong1/test.git"
        default:
            echo "please select correct repository"
            return null
    }
}

def makeBranch(String branchName) {
    sh """
    git checkout -b ${branchName}
    git push origin ${branchName}
    """
}

def makeTag(String tagName) {
    sh """
    git tag ${tagName}
    git push origin ${tagName}
    """
}

def createBranch(repository, sourceBranch, targetBranch) {
    repoURL = getRepoURL(repository)
    checkoutCode(repoURL, true, sourceBranch, 'B40a79e0bee6ebfe697da65c6e11f0db007a289d')
    makeBranch(targetBranch)
}

def createTag(repository, sourceTag, targetTag) {
    repoURL = getRepoURL(repository)
    checkoutCode(repoURL, true, sourceTag, 'B40a79e0bee6ebfe697da65c6e11f0db007a289d')
    makeTag(targetTag)
}

properties([
        parameters([
                choice(choices: 'branch\ntag', description: 'create branch or tag in github?', name: 'branchOrTag'),
                booleanParam(defaultValue: false, name: 'test'),
                string(defaultValue: '', description: 'input the git repo', name: 'gitPath'),
                string(defaultValue: '', description: 'input the source branch or tag name you want to copy from', name: 'sourceBr'),
                string(defaultValue: '', description: 'input the target branch or tag name you want to copy to', name: 'targetBr')
        ])
])

pipeline {
    agent any

    stages {
        stage('cloning branch') {
            when {
                expression { params.branchOrTag == 'branch' }
            }
            steps {
                script {
                    if (params.test) {
                        gt.createBranch('test', params.sourceBr, params.targetBr)
                    }

                }
            }
        }
      
