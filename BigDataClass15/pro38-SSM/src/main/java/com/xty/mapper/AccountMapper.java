package com.xty.mapper;

import com.xty.pojo.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AccountMapper {

    // 查询所有数据
    @Select("select * from account")
    @ResultMap("accountMap")
    List<Account> selectAll();

    // 查询单条数据
    @Select("select * from account where a_id=#{id}")
    @ResultMap("accountMap")
    Account selectById(int id);

    @Select("select * from account where a_name=#{name}")
    @ResultMap("accountMap")
    Account selectByName(String name);

    // 添加数据
    @Insert("insert into account(a_name,a_money) values (#{name},#{money})")
    void insert(Account account);

    // 修改数据
    @Update("update account set a_name=#{name},a_money=#{money} where a_id=#{id}")
    void update(Account account);

    // 删除数据
    @Update("delete from account where a_id=#{id}")
    void deleteById(int id);

    // 入账
    @Update("update account set a_money = a_money + #{money} where a_id = #{id}")
    void inMoney(@Param("id") int id, @Param("money") double money);

    // 出账
    @Update("update account set a_money = a_money - #{money} where a_id = #{id}")
    void outMoney(@Param("id") int id, @Param("money") double money);
}
