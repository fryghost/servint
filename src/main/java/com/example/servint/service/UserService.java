package com.example.servint.service;

import com.example.servint.service.dto.UserDTO;

/**
 * @Description TODO
 * @Author Zephyr Lin
 * @Date 2022/1/24 15:19
 **/
public interface UserService {

    /**
     * @description
     * @author Zephyr Lin
     * @created 2022/1/24 15:37
     [id]
     * @return java.example.serviceinterface.service.dto.UserDTO
     */
    UserDTO findUserById(Integer id);
}
