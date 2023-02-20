package com.xty.dao;

import com.xty.bean.User;
import com.xty.util.JdbcUtil;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

/**
 * 对 BaseDao 类的测试类
 * @param null: 
 * @return null
 * @author Mr.yu
 * @date 2023/2/20 16:24
 */
public class TestBaseDao {
    
    /**
     * 测试增删改
     * @author Mr.yu
     * @date 2023/2/20 16:29
     */
    @Test
    public void testUpdate(){
        BaseDao baseDao = new BaseDao();
        Connection conn = JdbcUtil.getConn();

        String sql = "insert into user(username,password,email) values(?,?,?);";

        String username = "xty666";
        String password = "123456";
        String email = "123456@qq.com";

        int update = baseDao.update(conn, sql, username, password, email);

        System.out.println("update = " + update);
        JdbcUtil.close(conn);
    }
    
    /**
     * 测试多条数据查询
     * @author Mr.yu
     * @date 2023/2/20 16:29
     */
    @Test
    public void testQueryAll(){
        BaseDao baseDao = new BaseDao();
        Connection conn = JdbcUtil.getConn();
        String sql = "select * from user";
        List<User> users = baseDao.queryAll(User.class, conn, sql);
        System.out.println("users = " + users);
        JdbcUtil.close(conn);
    }

    /**
     * 测试查询单条数据
     * @author Mr.yu
     * @date 2023/2/20 16:31
     */
    @Test
    public void testQueryOne(){
        BaseDao baseDao = new BaseDao();
        int id = 3;
        String sql = "select * from user where id = ?";
        Connection conn = JdbcUtil.getConn();
        User user = baseDao.queryOne(User.class, conn, sql, id);
        System.out.println("user = " + user);
    }
    
    /**
     * 测试查询单个值的方法
     * @author Mr.yu
     * @date 2023/2/20 16:45
     */
    @Test
    public void testQueryValue(){
        BaseDao baseDao = new BaseDao();
        String sql = "select count(*) from user;";
        Connection conn = JdbcUtil.getConn();
        Object o = baseDao.queryValue(conn, sql);

        System.out.println("o = " + o);
    }

}
