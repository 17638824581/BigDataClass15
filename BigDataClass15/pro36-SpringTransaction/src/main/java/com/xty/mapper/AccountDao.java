package com.xty.mapper;

/**
 * 针对与 Account表的操作类
 */
public interface AccountDao {

    // 出账
    void outMoney(int id, double money);

    // 入账
    void inMoney(int id, double money);
}
