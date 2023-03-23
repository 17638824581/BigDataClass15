package com.xty.mapper;

import com.xty.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountMapperTest {

    @Autowired
    private AccountMapper mapper;

    @Test
    public void selectAll() {
        List<Account> accounts = mapper.selectAll();

        System.out.println("accounts = " + accounts);
    }

    @Test
    public void selectById() {
        Account account = mapper.selectById(1);

        System.out.println("account = " + account);
    }

    @Test
    public void insert() {
        Account account = new Account();

        account.setName("李四");
        account.setMoney(888.0);

        mapper.insert(account);
    }

    @Test
    public void update() {
        Account account = new Account();

        account.setId(4);
        account.setName("张三");
        account.setMoney(88888.8);

        mapper.update(account);
    }

    @Test
    public void inMoney() {
        mapper.inMoney(1, 100.0);
    }

    @Test
    public void outMoney() {
        mapper.outMoney(1, 1000);
    }
}