package com.person.test.setting;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * 自定义退出执行方法
 * ApplicationContext退出时正常关闭，可以使用所有标准spring生命周期回调
 * 例如 DisposableBean接口和@PreDestroy注解
 */
@Component
public class MyDisposableBean implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("=========================================");
        System.out.println("退出执行方法："+MyDisposableBean.class);
        System.out.println("=========================================");
    }
}
