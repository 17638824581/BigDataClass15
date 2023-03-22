package com.xty.dao;

import com.xty.dao.impl.AccountDaoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountDaoTest {

    @Autowired
    private AccountDao accountDao;

    @Test
    public void testOutMoney(){
        accountDao.outMoney(1, 500);
    }

    @Test
    public void testInMoney(){
        accountDao.inMoney(1,600);
    }
}
