package com.xty.service.impl;

import com.xty.dao.AccountDao;
import com.xty.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private PlatformTransactionManager transactionManager;

    /**
     * 转账业务
     *
     * @param out_id ：转出账户id
     * @param in_id  ：转入账户id
     * @param money  ：转账的金额
     */
    @Override
    public void transfer(int out_id, int in_id, double money) {
        // 扣除转出账户金额
        accountDao.outMoney(out_id,money);
        System.out.println(1/0);
        // 添加给转入账户金额
        accountDao.inMoney(in_id,money);
    }



}
