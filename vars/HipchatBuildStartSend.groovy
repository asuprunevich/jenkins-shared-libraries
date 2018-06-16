#!/usr/bin/env groovy

def call(String CredKeyId, int RoomId) {

	hipchatSend(
		color: 'YELLOW',
		credentialId: CredKeyId,
		message: 'Build has been started',
		notify: true,
		room: RoomId,
		sendAs: 'JenkinsSharedLibrary',
		server: 'api.hipchat.com',
		v2enabled: true
	)
}
