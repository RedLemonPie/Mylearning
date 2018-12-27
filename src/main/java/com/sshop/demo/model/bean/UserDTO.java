package com.sshop.demo.model.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {

    private Integer id;
    private Integer score;

}