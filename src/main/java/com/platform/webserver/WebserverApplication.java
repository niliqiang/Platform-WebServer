package com.platform.webserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.platform.webserver.dao")
public class WebserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebserverApplication.class, args);
    }

}
