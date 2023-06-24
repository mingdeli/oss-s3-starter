package com.ldm.hello.auto;

import com.ldm.hello.bean.HelloProperties;
import com.ldm.hello.service.Helloservice;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = HelloProperties.class)
public class HelloAutoConfiguration {

    @ConditionalOnMissingBean(Helloservice.class)
    @Bean
    public Helloservice helloservice() {
        Helloservice helloservice = new Helloservice();
        helloservice.setName("a");
        return helloservice;
    }
}
