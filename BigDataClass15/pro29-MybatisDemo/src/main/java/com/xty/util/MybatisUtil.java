package com.xty.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        // 1. 通过Mybatis核心配置文件，创建出来 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);
    }

    /**
     * 获取一个 SqlSession 对象
     * @return
     * @throws IOException
     */
    public static SqlSession getSqlSession(){
        // 2. 通过 sqlSessionFactory 来获取 SqlSession （Sql会话对象）
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession;
    }

}
