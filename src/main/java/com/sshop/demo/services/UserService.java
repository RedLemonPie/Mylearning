package com.sshop.demo.services;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.sshop.demo.model.bean.User;


@WebService
public interface UserService {

    @WebMethod
    String getName(@WebParam(name = "id") String id);
    @WebMethod
    User getUser(String id);
}