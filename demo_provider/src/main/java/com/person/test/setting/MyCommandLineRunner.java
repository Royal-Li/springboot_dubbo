package com.person.test.setting;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 自定义启动放法
 * 如果启动后需要运行一些特定代码SpringAppliction，
 * 则可以实现ApplicationRunner或CommandLineRunner接口
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("=========================================");
        System.out.println("启动执行方法："+MyCommandLineRunner.class);
        System.out.println("=========================================");
    }
}
