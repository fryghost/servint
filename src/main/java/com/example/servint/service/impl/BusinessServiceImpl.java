package com.example.servint.service.impl;

import com.example.servint.service.BusinessService;
import com.example.servint.service.UserService;
import com.example.servint.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.servint.service.impl.UserServiceFromYG;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @Author Zephyr Lin
 * @Date 2022/1/24 15:36
 **/
@Service
public class BusinessServiceImpl implements BusinessService {

    private UserServiceFromYG ygUser;

    public BusinessServiceImpl(UserServiceFromYG ygUser){
        this.ygUser=ygUser;
    }

    @Resource(name="userServiceFromCRMImpl")
    private UserService crmUser;

    @Override
    public UserDTO actionA(Integer id){
        UserDTO userDTO=this.ygUser.findUserById(id);
        return userDTO;
    }

    @Override
    public UserDTO actionB(Integer id){
        UserDTO userDTO=crmUser.findUserById(id);
        return userDTO;
    }
}
