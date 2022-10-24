package com.example.sns.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;


    @Test
    void 회원가입이_정상적으로_동작하는_경우(){

        String userName = "userName";
        String password = "password";


        Assertions.assertDoesNotThrow(() -> userService.join(userName,password));
    }
}
