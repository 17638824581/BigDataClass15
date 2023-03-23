package com.xty.service.impl;

import com.xty.mapper.AccountDao;
import com.xty.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 转账业务
     *
     * @param out_id ：转出账户id
     * @param in_id  ：转入账户id
     * @param money  ：转账的金额
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRES_NEW, timeout = 10)
    public void transfer(int out_id, int in_id, double money) {
        // 扣除转出账户金额
        accountDao.outMoney(out_id,money);
        // 添加给转入账户金额
        accountDao.inMoney(in_id,money);
    }

}
