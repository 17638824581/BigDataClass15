package com.xty.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtil {

    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        String resource = "mybatis.xml";
        InputStream stream = MybatisUtil.class.getResourceAsStream("mybatis.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

    public static SqlSession getSqlSession(boolean b){
        return sqlSessionFactory.openSession(b);
    }

}
