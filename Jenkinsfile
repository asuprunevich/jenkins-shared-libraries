#!/usr/bin/env groovy

@Library('jenkins-shared-libraries')_

pipeline {

        environment {

		name  = 'DEMO'
		KeyID = 'HipchatTestKeyId'
		RoomId = 'HipchatTestRoomId'
		
		
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
    				HipchatBuildStartSend "${KeyID} ${RoomId}"
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
