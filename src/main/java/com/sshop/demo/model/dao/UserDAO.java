package com.sshop.demo.model.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sshop.demo.model.bean.User;

@Mapper
public interface UserDAO {

    public User find(@Param("name") String name, @Param("password") String password);

}
