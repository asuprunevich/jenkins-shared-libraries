#!/usr/bin/env groovy

def call(String CredKeyId) {

	hipchatSend(
		color: 'YELLOW',
		credentialId: "${CredKeyId}",
		message: 'Build has been started',
		notify: true,
		room: '4048687',
		sendAs: 'JenkinsSharedLibrary',
		server: 'api.hipchat.com',
		v2enabled: true
	)
}
