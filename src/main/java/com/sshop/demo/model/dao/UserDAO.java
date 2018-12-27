package com.sshop.demo.model.dao;

import com.sshop.demo.model.bean.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sshop.demo.model.bean.User;

@Mapper
public interface UserDAO {

    public User findAll(@Param("name") String name, @Param("password") String password);
    public UserDTO findScore(@Param("id") int id);

}
