package com.dong.dao;

import com.dong.model.User;

import java.util.List;

/**
 * @Author: hifdong
 * @Date: 16/1/20.
 */
public interface UserDao {
    public List<User> getUserList(int id);
}
