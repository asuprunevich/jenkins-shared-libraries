#!/usr/bin/env groovy

def call(String KeyId, int RoomId) {

	hipchatSend
		color: 'YELLOW',
		credentialId: KeyId,
		message: 'Build has been started',
		notify: true,
		room: RoomId,
		sendAs: 'JenkinsSharedLibrary',
		server: 'api.hipchat.com',
		v2enabled: true
}
