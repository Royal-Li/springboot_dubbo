package com.person.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoComsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoComsumerApplication.class, args);
        System.out.println("comsumer 启动完毕");
    }

}
