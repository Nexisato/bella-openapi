package com.ke.bella.openapi.protocol.asr;

import lombok.Data;

@Data
public class TencentProperty extends AsrProperty {
	int chunkSize = 4096;
	int intervalMs = 40;
}
