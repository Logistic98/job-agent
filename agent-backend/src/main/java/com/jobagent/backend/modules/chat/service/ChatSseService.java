package com.jobagent.backend.modules.chat.service;

import com.jobagent.backend.modules.chat.dto.request.ChatStreamRequest;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

public interface ChatSseService {
    SseEmitter stream(ChatStreamRequest request);
}
