package com.platform.webserver.controller;

import com.alibaba.fastjson.JSONObject;
import com.platform.webserver.entity.TrainingPlanEntity;
import com.platform.webserver.service.TrainingPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/plan")
public class TrainingPlanController {
    @Autowired
    private TrainingPlanService trainingPlanService;

    @RequestMapping("/list")
    public List<TrainingPlanEntity> getTrainingPlanList() {
        return trainingPlanService.queryTrainingPlanList();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Object signUp(HttpServletRequest request) {
        JSONObject result = new JSONObject();
        String id = request.getParameter("id");
        int index = trainingPlanService.delete(id);
        if(index>0) {
            result.put("msg", "删除成功！");
            result.put("flag", true);
        } else {
            result.put("msg", "删除失败！");
            result.put("flag", false);
        }
        return result;
    }
}
