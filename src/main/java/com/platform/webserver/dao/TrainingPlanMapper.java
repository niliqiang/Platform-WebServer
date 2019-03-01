package com.platform.webserver.dao;

import com.platform.webserver.entity.TrainingPlanEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TrainingPlanMapper {
    int delete(String id);
    List<TrainingPlanEntity> trainingPlanList();
}
