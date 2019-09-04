package com.example.cloudprovide;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("ServiceApp1 remotetee2222222222222")
public interface RemoteClient {
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    String test();
    @RequestMapping(method = RequestMethod.GET, value = "/info")
    String info();
}
