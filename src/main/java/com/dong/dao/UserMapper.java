package com.dong.dao;

import com.dong.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: hifdong
 * @Date: 16/1/18.
 */
public interface UserMapper {
    @Select("SELECT * FROM user WHERE id = #{userId}")
    List<User> getUserList(@Param("userId") long id);
}
