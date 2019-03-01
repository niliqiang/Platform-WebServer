package com.platform.webserver.service;

import com.platform.webserver.entity.UserInfoEntity;

import java.util.List;

public interface UserInfoService {
    int add(UserInfoEntity userInfo);
    int delete(String id);
    List<UserInfoEntity> queryUserInfoList();
}
