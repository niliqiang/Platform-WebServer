package com.platform.webserver.dao;

import com.platform.webserver.entity.UserInfoEntity;
import org.springframework.stereotype.Component;

@Component
public interface UserInfoMapper {
    int signUp(UserInfoEntity userInfo);
    UserInfoEntity signIn(String phone, String passwd);

}
