package com.example.servint.service.impl;

import com.example.servint.service.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Description crm的用户
 * @Author Zephyr Lin
 * @Date 2022/1/24 15:43
 **/
@Service
@Slf4j
public class UserServiceFromYG {

    public UserDTO findUserById(Integer id) {

        //从yg中查找user
        log.debug("from yg");
        UserDTO userDTO=new UserDTO();
        userDTO.setType("yg");
        return userDTO;
    }
}
