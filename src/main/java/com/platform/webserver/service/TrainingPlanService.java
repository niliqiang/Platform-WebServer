package com.platform.webserver.service;

import com.platform.webserver.entity.TrainingPlanEntity;

import java.util.List;

public interface TrainingPlanService {
    int delete(String id);
    List<TrainingPlanEntity> queryTrainingPlanList();
}
