#!/usr/bin/env groovy

@Library('jenkins-shared-libraries')_

pipeline {

        environment {

		name  = 'DEMO'
		CredKeyID = 'HipchatTestKeyId'
		RoomId = '4048687'
		
		
        }

        agent {
                label 'master'
        }

        options {
                buildDiscarder(logRotator(numToKeepStr:'10'))
                disableConcurrentBuilds()
        }


        stages {
                stage('Demo') {
                        steps {
    				echo 'Hello world'
    				sayHello "${name}"
                        }
                }
                stage('HipChat') {
                        steps {
    				echo 'Sending notification...'
    				HipchatBuildStartSend "${CredKeyID}"
                        }
                }
		stage('log') {
			steps {
				script {
					log.info 'Starting'
					log.warning 'Nothing to do!'
				}
			}
		}
	}
}
