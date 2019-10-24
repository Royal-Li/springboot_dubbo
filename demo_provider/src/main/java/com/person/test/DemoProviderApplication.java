package com.person.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableDubbo
@SpringBootApplication
public class DemoProviderApplication {

    @Value("${properties.location}")
    private static String properties;

    public static void main(String[] args) {
        SpringApplication.run(DemoProviderApplication.class, args);
        System.out.println("provider 启动完毕"+"--"+ properties);
    }

}
