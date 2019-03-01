package com.platform.webserver.dao;

import com.platform.webserver.entity.UserInfoEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserInfoMapper {
    int add(UserInfoEntity userInfo);
    int delete(String id);
    List<UserInfoEntity> userInfoList();
}
