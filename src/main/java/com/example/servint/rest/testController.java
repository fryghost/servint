package com.example.servint.rest;


import com.example.servint.service.BusinessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author Zephyr Lin
 * @Date 2022/1/24 15:52
 **/
@RestController
@Slf4j
@RequestMapping("test")
public class testController {

    @Autowired
    private BusinessService businessService;

    @GetMapping("a")
    public ResponseEntity a(){
        return new ResponseEntity(businessService.actionA(1), HttpStatus.OK);
    }

    @GetMapping("b")
    public ResponseEntity b(){
        return new ResponseEntity(businessService.actionB(1), HttpStatus.OK);
    }
}
