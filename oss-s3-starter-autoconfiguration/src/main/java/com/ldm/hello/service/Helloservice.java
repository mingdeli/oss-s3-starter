package com.ldm.hello.service;

import com.ldm.hello.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Helloservice {

    @Autowired
    private HelloProperties helloProperties;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Helloservice() {
    }

    public String sayHello(String userName) {
        return helloProperties.getPrefix() + ":" + userName + ":" + helloProperties.getSuffix() + ":" + name;
    }


}
