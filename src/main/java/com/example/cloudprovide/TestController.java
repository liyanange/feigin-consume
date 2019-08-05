package com.example.cloudprovide;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @Autowired
    private RemoteClient remoteClient;

    @RequestMapping("/test")
    public String test() {
        return remoteClient.test();
    }
    @RequestMapping("/info")
    public String info() {
        return remoteClient.info();
    }

}
