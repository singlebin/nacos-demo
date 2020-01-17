package com.springcloud.demo.feignclient;

import com.springcloud.demo.feignclient.fallback.ProduceFeignclientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @Author: wub
 * @date 2020/1/17 9:37
 */
@FeignClient(value = "nacos-produce", fallback = ProduceFeignclientFallback.class)
@Component
public interface ProduceFeignclient {

    @GetMapping("/nacos/hi")
    public String hi(@RequestParam("name") String name);
}
