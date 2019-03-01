package com.platform.webserver.controller;

import com.alibaba.fastjson.JSONObject;
import com.platform.webserver.entity.UserInfoEntity;
import com.platform.webserver.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello SpringBoot!";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Object signUp(HttpServletRequest request) {
        JSONObject result = new JSONObject();
        UserInfoEntity userInfo = new UserInfoEntity();
        userInfo.setPhone(request.getParameter("phone"));
        userInfo.setPasswd(request.getParameter("passwd"));
        int index = userInfoService.signUp(userInfo);
        if(index>0) {
            result.put("msg", "注册成功！");
            result.put("flag", true);
        } else {
            result.put("msg", "注册失败！");
            result.put("flag", false);
        }
        return result;
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Object signIn(HttpServletRequest request) {
        JSONObject result = new JSONObject();
        String phone = request.getParameter("phone");
        String passwd = request.getParameter("passwd");
        UserInfoEntity userInfo = userInfoService.signIn(phone, passwd);
        if(userInfo != null) {
            result.put("msg", "登录成功！");
            result.put("flag", true);
        } else {
            result.put("msg", "登录失败！");
            result.put("flag", false);
        }
        return result;
    }
}
