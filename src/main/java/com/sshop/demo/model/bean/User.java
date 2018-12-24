package com.sshop.demo.model.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private Integer id;
    private String name;
    private String password;
    private String address;

    @Override
    public String toString() {
        return "User [userId=" + id + ", name=" + name + ", address=" + address + "]";
    }
}