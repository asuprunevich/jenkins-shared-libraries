#!/usr/bin/env groovy

@Library('jenkins-shared-libraries')_

pipeline {

        environment {

		name  = 'DEMO'
		key = 'on3TyKN2nVF69d2jJJ2afaqEH86Vx0Yre9Nqna7V'
		room = '4048687'
		
		
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
		stage('log') {
			steps {
				script {
					log.info 'Starting'
					log.warning 'Nothing to do!'
					hipchat.SendBuildStart "${key} ${room}"				
				}
			}
		}
	}
}
