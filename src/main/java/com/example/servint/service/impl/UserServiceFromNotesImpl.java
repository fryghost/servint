package com.example.servint.service.impl;

import com.example.servint.service.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.example.servint.service.UserService;

/**
 * @Description notes的用户
 * @Author Zephyr Lin
 * @Date 2022/1/24 15:38
 **/
@Service
@Slf4j
public class UserServiceFromNotesImpl implements UserService {

    @Override
    public UserDTO findUserById(Integer id){
        //从notes中查找user
        log.debug("from notes");
        UserDTO userDTO=new UserDTO();
        userDTO.setType("notes");
        return userDTO;
    }
}
