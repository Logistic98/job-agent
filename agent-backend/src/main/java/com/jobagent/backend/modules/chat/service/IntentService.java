package com.jobagent.backend.modules.chat.service;

import com.jobagent.backend.modules.chat.vo.IntentResult;

public interface IntentService {
    IntentResult classify(String message);
}
