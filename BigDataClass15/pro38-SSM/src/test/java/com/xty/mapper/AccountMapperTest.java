package com.xty.mapper;

import com.xty.pojo.Account;
import com.xty.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AccountMapperTest {

    @Test
    public void selectAll() {
        SqlSession sqlSession = MybatisUtil.gerSqlSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);

        List<Account> accounts = mapper.selectAll();

        System.out.println("accounts = " + accounts);
    }

    @Test
    public void selectById() {

    }

    @Test
    public void insert() {

    }

    @Test
    public void update() {

    }

    @Test
    public void inMoney() {

    }

    @Test
    public void outMoney() {

    }
}