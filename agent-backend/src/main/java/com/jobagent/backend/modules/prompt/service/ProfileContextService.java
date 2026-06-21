package com.jobagent.backend.modules.prompt.service;

import com.jobagent.backend.modules.prompt.model.UserProfileContext;

public interface ProfileContextService {
    UserProfileContext current(String userId, String resumeId);
}
