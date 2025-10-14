package com.ke.bella.openapi.protocol.asr;

import com.ke.bella.openapi.protocol.Callbacks;

import lombok.Data;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

public class TencentRealTimeAsrCallback extends WebSocketListener implements Callbacks.WebSocketCallback  {

	@Data
	private static class ClientRequest {

	}

	@Override
	public void onOpen(WebSocket webSocket, okhttp3.Response response) {
		// TODO Auto-generated method stub

	}


	@Override
	public void onMessage(WebSocket webSocket, String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onMessage(WebSocket webSocket, ByteString bytes) {
		// TODO Auto-generated method stub
	}


	@Override
	public void onClosing(WebSocket webSocket, int code, String reason) {
		// TODO Auto-generated method stub
	}


	@Override
	public void onClosed(WebSocket webSocket, int code, String reason) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onFailure(WebSocket webSocket, Throwable t, okhttp3.Response response) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean started() {
		// TODO Auto-generated method stub
		return false;
	}


}
