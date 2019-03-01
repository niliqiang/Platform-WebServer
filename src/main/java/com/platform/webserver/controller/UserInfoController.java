package com.platform.webserver.controller;

import com.platform.webserver.entity.UserInfoEntity;
import com.platform.webserver.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello SpringBoot!";
    }

    @RequestMapping("/infoList")
    public List<UserInfoEntity> getUserInfoList() {
        return userInfoService.queryUserInfoList();
    }

}
