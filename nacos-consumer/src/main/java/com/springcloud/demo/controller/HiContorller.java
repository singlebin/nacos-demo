package com.springcloud.demo.controller;

import com.springcloud.demo.feignclient.ProduceFeignclient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @Author: wub
 * @date 2020/1/17 9:48
 */
@RestController
@RequestMapping("/test")
public class HiContorller {

    @Autowired
    private ProduceFeignclient produceFeignclient;

    @GetMapping("/hi")
    public String hi(){
        return produceFeignclient.hi("wub");
    }
}
