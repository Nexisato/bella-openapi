package com.ke.bella.openapi.protocol.asr.realtime;

import java.util.List;
import java.util.function.Function;

import org.springframework.stereotype.Component;

import okhttp3.WebSocket;
import com.ke.bella.openapi.protocol.realtime.RealTimeMessage;
import com.ke.bella.openapi.EndpointProcessData;
import com.ke.bella.openapi.protocol.Callbacks;
import com.ke.bella.openapi.protocol.asr.AsrProperty;
import com.ke.bella.openapi.protocol.asr.TencentProperty;
import com.ke.bella.openapi.protocol.asr.TencentRealTimeAsrCallback;
import com.ke.bella.openapi.protocol.asr.TencentRealTimeAsrRequest;
import com.ke.bella.openapi.protocol.asr.TencentRealTimeAsrResponse;

import com.ke.bella.openapi.protocol.log.EndpointLogger;

/**
 * 腾讯云实时语音识别适配器
 */
@Component("TencentRealtimeAsr")
public class TencentAdaptor implements RealTimeAsrAdaptor<TencentProperty> {
	@Override
	public WebSocket startTranscription(String url, TencentProperty property, com.ke.bella.openapi.protocol.realtime.RealTimeMessage request,
			com.ke.bella.openapi.protocol.Callbacks.WebSocketCallback callback) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean sendAudioData(WebSocket webSocket, byte[] audioData, Callbacks.WebSocketCallback callback) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean stopTranscription(WebSocket webSocket, RealTimeMessage request,
			Callbacks.WebSocketCallback callback) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void closeConnection(WebSocket webSocket) {
		webSocket.close(1000, "client close");
	}

	@Override
	public Callbacks.WebSocketCallback createCallback(Callbacks.Sender sender, EndpointProcessData processData, EndpointLogger logger,
	String taskId, RealTimeMessage request, TencentProperty property) {
		// TODO Auto-generated method stub
		return new TencentRealTimeAsrCallback();
	}

	@Override
	public String getDescription() {
		return "腾讯云协议";
	}

	@Override
	public Class<TencentProperty> getPropertyClass() {
		return TencentProperty.class;
	}

	private static class Converter implements Function<TencentRealTimeAsrResponse, List<String>> {
		private final String taskId;

		public Converter(String taskId) {
			this.taskId = taskId;
		}

		@Override
		public List<String> apply(TencentRealTimeAsrResponse response) {
			// TODO Auto-generated method stub
			return null;
		}
	}

}
