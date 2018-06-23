#!/usr/bin/env groovy

@Library('jenkins-shared-libraries')_

pipeline {

        environment {

		name  = 'Bla'
		secondname = 'Hehe'
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
    				sayHello("${name}", "${secondname}") 
                        }
                }
                stage('HipChat') {
                        steps {
    				echo 'Sending notification...'
    				HipchatBuildStartSend("${CredKeyID}", "${RoomId}")
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
