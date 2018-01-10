package com.neweast.demo.service.impl;

import com.neweast.demo.domain.User;
import com.neweast.demo.mapper.UserMapper;
import com.neweast.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liwg2 on 2018/1/8.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }
}
