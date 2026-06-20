package com.jobagent.backend.modules.auth.dto.response;

import lombok.Data;
import com.jobagent.backend.common.dto.MapBackedDto;

import java.util.Map;

@Data
public class BossLoginStatusResponse extends MapBackedDto {
    public BossLoginStatusResponse() {
    }

    public BossLoginStatusResponse(Map<String, Object> fields) {
        super(fields);
    }

    public static BossLoginStatusResponse from(Map<String, Object> fields) {
        return new BossLoginStatusResponse(fields);
    }
}
