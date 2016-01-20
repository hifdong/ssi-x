package com.dong.service;

import com.dong.dao.UserDao;
import com.dong.dao.UserMapper;
import com.dong.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: hifdong
 * @Date: 16/1/17.
 */

@Service
public class UserServiceImpl {
  @Autowired
   private UserDao userDao;


    public List<User> getUserList(long id) {
        return userDao.getUserList(1);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
