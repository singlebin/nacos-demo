package com.springcloud.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @Author: wub
 * @date 2020/1/17 9:32
 */
@RestController
@RequestMapping("/nacos")
@RefreshScope
public class TestController {

    /**
     * 集群IP和端口
     **/
    @Value("${spring.data.elasticsearch.cluster-nodes}")
    private String clusterNodes;
    /**
     * 集群名称
     */
    @Value("${spring.data.elasticsearch.cluster-name}")
    private String clusterName;

    /**
     * @param name
     * @return
     */
    @GetMapping("/hi")
    public String hi(@RequestParam("name") String name) {
        return "hi" + clusterName;
    }

}
