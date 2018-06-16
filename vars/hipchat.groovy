#!/usr/bin/env groovy

def SendBuildStart call(String key, int room) {

	hipchatSend
		color: 'YELLOW',
		credentialId: key,
		message: 'Build has been started',
		notify: true,
		room: room,
		sendAs: 'JenkinsSharedLibrary',
		server: 'api.hipchat.com',
		v2enabled: true
}
