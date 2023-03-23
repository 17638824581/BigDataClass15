package com.xty.service;

import com.xty.pojo.Account;

import java.util.List;

public interface AccountService {
    void saveAccount(Account account);
    void updateAccount(Account account);
    void deleteAccount(int id);
    List<Account> findAll();
    Account findById(int id);
    void transfer(String sourceName, String targetName, double money);
}
