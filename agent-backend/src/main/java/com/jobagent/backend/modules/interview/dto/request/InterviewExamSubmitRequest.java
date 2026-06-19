package com.jobagent.backend.modules.interview.dto.request;

import lombok.Data;
import com.jobagent.backend.common.dto.MapBackedDto;

import java.util.Map;

@Data
public class InterviewExamSubmitRequest extends MapBackedDto {
    public InterviewExamSubmitRequest() {
    }

    public InterviewExamSubmitRequest(Map<String, Object> fields) {
        super(fields);
    }

    public static InterviewExamSubmitRequest from(Map<String, Object> fields) {
        return new InterviewExamSubmitRequest(fields);
    }
}
