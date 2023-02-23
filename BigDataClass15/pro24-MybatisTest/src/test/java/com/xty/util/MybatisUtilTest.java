package com.xty.util;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MybatisUtilTest {
    @Test
    public void testGetSqlSession(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        System.out.println(sqlSession);
    }
}
