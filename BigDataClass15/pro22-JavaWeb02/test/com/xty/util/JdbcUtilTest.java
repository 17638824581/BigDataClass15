package com.xty.util;

import org.junit.Test;

import java.sql.Connection;

/**
 * 用来测试 JdbcUtil 的测试类
 * @author Mr.yu
 * @date 2023/2/20 16:07
 */
public class JdbcUtilTest {
    /**
     * 测试获取数据库连接和关闭数据库连接
     */
    @Test
    public void testGetConn(){
        Connection conn = JdbcUtil.getConn();
        System.out.println("conn = " + conn);
        JdbcUtil.close(conn);
    }

}
