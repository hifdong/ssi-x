package com.dong.dao;

import com.dong.model.User;

import java.util.List;

/**
 * @Author: hifdong
 * @Date: 16/1/20.
 */
public class UserDaoImpl implements UserDao {
    private UserMapper userMapper;

    public List<User> getUserList(int id) {
       return  userMapper.getUserList(id);
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
