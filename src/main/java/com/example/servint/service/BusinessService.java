package com.example.servint.service;

import com.example.servint.service.dto.UserDTO;

/**
 * @Description TODO
 * @Author Zephyr Lin
 * @Date 2022/1/24 16:13
 **/
public interface BusinessService {

    UserDTO actionA(Integer id);

    UserDTO actionB(Integer id);
}
