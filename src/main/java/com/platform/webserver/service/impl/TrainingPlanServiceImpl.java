package com.platform.webserver.service.impl;

import com.platform.webserver.dao.TrainingPlanMapper;
import com.platform.webserver.entity.TrainingPlanEntity;
import com.platform.webserver.service.TrainingPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingPlanServiceImpl implements TrainingPlanService {
    @Autowired
    TrainingPlanMapper trainingPlanMapper;

    @Override
    public int delete(String id) {
        return this.trainingPlanMapper.delete(id);
    }

    @Override
    public List<TrainingPlanEntity> queryTrainingPlanList() {
        return this.trainingPlanMapper.trainingPlanList();
    }
}
