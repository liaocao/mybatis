package com.cookie.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public Person selectUser(int id) {
        return userMapper.selectUser(id);
    }

}