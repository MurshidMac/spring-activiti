package com.zaizi.zaiziconnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ZaiziconnectApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZaiziconnectApplication.class, args);
    }
}

