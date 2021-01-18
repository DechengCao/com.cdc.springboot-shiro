package com.cdc;

import com.cdc.pojo.User;
import com.cdc.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShiroSpringbootApplicationTests {
    @Autowired
    UserServiceImpl userService;

    @Test
    void contextLoads() {
        User cdc = userService.queryUserByName("cdc");
        System.out.println(cdc);
    }

}
