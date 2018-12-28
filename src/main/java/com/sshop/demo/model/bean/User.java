package com.sshop.demo.model.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = -526324944915280489L;
    private Integer id;
    private String name;
    private String password;
    private String email;
    private Integer score;

}