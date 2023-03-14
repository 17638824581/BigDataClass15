package com.xty.test;

import com.xty.configration.SpringContextConfigration;
import com.xty.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringContextConfigration.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testSave(){
        userService.save();
    }
}
