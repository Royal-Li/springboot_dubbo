package com.person.test.service.impl;


import com.person.test.bean.User;
import com.person.test.service.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "${demo.service.version}")
public class UserServiceImpl implements UserService {

    @Override
    public User queryUser() {
        User user = new User();
        user.setId(100195909L);
        user.setName("Jason_Lzs");
        user.setMail("1365992340@qq.com");
        return user;
    }
}
