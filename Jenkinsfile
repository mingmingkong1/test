#!/usr/bin/env groovy

properties([
        parameters([
                choice(choices: 'branch\ntag', description: 'create branch or tag in github?', name: 'branchOrTag'),
                booleanParam(defaultValue: false, name: 'test'),
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
        stage('cloning tag') {
            when {
                expression { params.branchOrTag == 'tag' }
            }
            steps {
                script {
                    if (params.test) {
                        gt.createTag('test', params.sourceBr, params.targetBr)
                    }
                   
                   
                }
            }
        }
    }
}
