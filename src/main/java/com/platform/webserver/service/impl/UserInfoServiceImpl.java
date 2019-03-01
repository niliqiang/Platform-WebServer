package com.platform.webserver.service.impl;

import com.platform.webserver.dao.UserInfoMapper;
import com.platform.webserver.entity.UserInfoEntity;
import com.platform.webserver.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public int signUp(UserInfoEntity userInfo){
        return this.userInfoMapper.signUp(userInfo);
    }

    @Override
    public UserInfoEntity signIn(String phone, String passwd) {
        return this.userInfoMapper.signIn(phone, passwd);
    }

}
