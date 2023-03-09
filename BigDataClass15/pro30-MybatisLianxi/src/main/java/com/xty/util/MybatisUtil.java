package com.xty.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ResourceBundle;

public class MybatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        // 怎么读取 类加载路径下的 配置文件
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 怎么获取 配置文件的 输入流？
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }

    public static SqlSession getSqlSession(){

        SqlSession sqlSession = sqlSessionFactory.openSession();

        return sqlSession;
    }

    public static SqlSession getSqlSession(boolean b){

        SqlSession sqlSession = sqlSessionFactory.openSession(b);

        return sqlSession;
    }
}
