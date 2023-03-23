package com.xty.service;

public interface AccountService {
    /**
     * 转账业务
     * @param out_id：转出账户id
     * @param in_id：转入账户id
     * @param money：转账的金额
     */
    void transfer(int out_id, int in_id, double money);
}
