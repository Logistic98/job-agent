package com.jobagent.backend.common.dto.response;

import lombok.Data;

@Data
public class DeleteCountResponse {
    private int deleted;

    public DeleteCountResponse() {
    }

    public DeleteCountResponse(int deleted) {
        this.deleted = deleted;
    }
}
