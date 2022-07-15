package com.java.springbootrestapiopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringbootRestApiOpenfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestApiOpenfeignApplication.class, args);
    }

}