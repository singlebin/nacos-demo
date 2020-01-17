package com.springcloud.demo.feignclient.fallback;

import com.springcloud.demo.feignclient.ProduceFeignclient;
import feign.hystrix.FallbackFactory;

/**
 * @description:
 * @Author: wub
 * @date 2020/1/17 10:01
 */
public class ProduceFeignclientFallback implements FallbackFactory<ProduceFeignclient> {
    @Override
    public ProduceFeignclient create(Throwable throwable) {
        return new ProduceFeignclient() {
            @Override
            public String hi(String name) {
                return "null";
            }
        };
    }
}
