package com.sshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sshop.demo.model.bean.User;
import com.sshop.demo.model.bean.UserDTO;
import com.sshop.demo.model.dao.UserDAO;

import javax.servlet.http.HttpServletRequest;

@RestController
public class BasicController {

    @Autowired
    private UserDAO userDAO;

    @GetMapping(value = "")
    public String index() {
        return "login"; // 此处表示返回值是一个值为“login”的String。不指向界面的原因是类的注解是@RestController
    }

    @GetMapping(value = "searchScore.do")
    public Object login(int id) {
        System.out.println("传入参数：id"+id);
        UserDTO userDTO = userDAO.findScore(id);
        return userDTO;
    }

    @GetMapping(value = "login")
    public ModelAndView index2() {
        return new ModelAndView("login"); // 此处指向界面
    }


    @GetMapping(value = "login.do")
    public Object login(String name, String password) {
        System.out.println("传入参数：name=" + name + ", password=" + password);
        if (StringUtils.isEmpty(name)) {
            return "name不能为空";
        } else if (StringUtils.isEmpty(password)) {
            return "password不能为空";
        }
        User user = userDAO.findAll(name, password);
        if (user != null) {
            return user;
        } else {
            return "用户名或密码错误";
        }
    }



}