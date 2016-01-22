package com.dong.service.Impl;

import com.dong.mapper.UserMapper;
import com.dong.model.User;
import com.dong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: hifdong
 * @Date: 16/1/17.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserList(int id) {
//        return userDao.getUserList(id);
        return userMapper.getUserList(id);
    }


}
