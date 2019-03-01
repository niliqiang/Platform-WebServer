package com.platform.webserver.service.impl;

import com.platform.webserver.dao.UserInfoMapper;
import com.platform.webserver.entity.UserInfoEntity;
import com.platform.webserver.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public int add(UserInfoEntity userInfo){
        return this.userInfoMapper.add(userInfo);
    }

    @Override
    public int delete(String id) {
        return this.userInfoMapper.delete(id);
    }

    @Override
    public List<UserInfoEntity> queryUserInfoList() {
        return this.userInfoMapper.userInfoList();
    }
}
