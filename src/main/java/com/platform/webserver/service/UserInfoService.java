package com.platform.webserver.service;

import com.platform.webserver.entity.UserInfoEntity;

public interface UserInfoService {
    int signUp(UserInfoEntity userInfo);
    UserInfoEntity signIn(String phone, String passwd);
}
