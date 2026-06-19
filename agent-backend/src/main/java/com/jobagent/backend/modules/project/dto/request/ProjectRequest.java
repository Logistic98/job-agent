package com.jobagent.backend.modules.project.dto.request;

import lombok.Data;
import com.jobagent.backend.common.dto.MapBackedDto;

import java.util.Map;

@Data
public class ProjectRequest extends MapBackedDto {
    public ProjectRequest() {
    }

    public ProjectRequest(Map<String, Object> fields) {
        super(fields);
    }

    public static ProjectRequest from(Map<String, Object> fields) {
        return new ProjectRequest(fields);
    }
}
