package com.dahua.test;

import com.dahua.util.JdbcUtil;
import org.junit.Test;

import java.sql.Connection;

public class JdbcUtilTest {

    @Test
    public void testGetConn(){
        Connection conn = JdbcUtil.getConn();
        System.out.println("conn = " + conn);
    }
}
