package com.ldm.hello.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("ldm.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public HelloProperties() {
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSuffix() {
        return suffix;
    }

}
