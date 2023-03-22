package com.xty.dao.impl;

import com.xty.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void outMoney(int id, double money) {
        int update = jdbcTemplate.update("update account set a_money = a_money - ? where a_id = ?", money, id);
        System.out.println("账户"+id+"已转出"+money+"元钱");
    }

    @Override
    public void inMoney(int id, double money) {
        int update = jdbcTemplate.update("update account set a_money = a_money + ? where a_id = ?", money, id);
        System.out.println("账户"+id+"已转入"+money+"元钱");
    }
}
