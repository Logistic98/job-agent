package com.jobagent.backend.modules.chat.service;

import com.jobagent.backend.modules.chat.dto.request.ChatRequest;
import com.jobagent.backend.modules.chat.vo.ChatResponse;

public interface AgentFlowService {
    ChatResponse answer(ChatRequest request);
}
