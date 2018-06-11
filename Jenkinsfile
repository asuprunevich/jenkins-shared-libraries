#!/usr/bin/env groovy

@Library('jenkins-shared-libraries')_

pipeline {

        environment {

		name  = 'Dave'
		
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
    				sayHello 'Dave'
                        }
                }
	}
}
