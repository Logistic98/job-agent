package com.jobagent.backend.modules.prompt.service;

import com.jobagent.backend.modules.chat.entity.ChatSessionState;
import com.jobagent.backend.modules.chat.vo.IntentResult;
import com.jobagent.backend.modules.prompt.model.PersonalContext;

public interface PersonalContextBuilder {
    PersonalContext build(String userId, String message, IntentResult intent, ChatSessionState state);
}
