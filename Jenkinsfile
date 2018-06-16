#!/usr/bin/env groovy

@Library('jenkins-shared-libraries')_

pipeline {

        environment {

		name  = 'DEMO'
		
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
				log.info 'Starting'
				log.warning 'Nothing to do!'
			}
		}
	}
}
