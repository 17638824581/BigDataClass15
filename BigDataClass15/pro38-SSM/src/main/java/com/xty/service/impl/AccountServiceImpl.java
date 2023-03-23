package com.xty.service.impl;

import com.xty.mapper.AccountMapper;
import com.xty.pojo.Account;
import com.xty.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper mapper;

    @Override
    public void saveAccount(Account account) {
        mapper.insert(account);
    }

    @Override
    public void updateAccount(Account account) {
        mapper.insert(account);
    }

    @Override
    public void deleteAccount(int id) {
        mapper.deleteById(id);
    }

    @Override
    public List<Account> findAll() {
        return mapper.selectAll();
    }


    @Override
    public Account findById(int id) {
        return mapper.selectById(id);
    }

    @Override
    public void transfer(String sourceName, String targetName, double money) {
        Account outAccount = mapper.selectByName(sourceName);
        Account InAccount = mapper.selectByName(targetName);

        // 执行转账业务
        mapper.outMoney(outAccount.getId(),money);
        mapper.inMoney(InAccount.getId(),money);
    }
}
