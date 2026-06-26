package com.jobagent.backend.modules.job.service;

import java.util.List;
import java.util.Map;

import com.jobagent.backend.modules.job.dto.command.JobFavoriteAnalysisCommand;
import com.jobagent.backend.modules.job.dto.command.JobFavoriteSaveCommand;

public interface JobFavoriteService {
    List<Map<String, Object>> listFavorites();
    void saveFavorite(JobFavoriteSaveCommand command);
    void removeFavorite(String jobKey);
    Map<String, Object> analyzeFavorite(JobFavoriteAnalysisCommand command);
    Map<String, Object> analyzeJob(JobFavoriteSaveCommand command, String resumeId);
}
