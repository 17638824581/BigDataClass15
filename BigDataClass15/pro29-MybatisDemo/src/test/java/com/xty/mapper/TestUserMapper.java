package com.xty.mapper;

import com.xty.pojo.User;
import com.xty.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestUserMapper {

    @Test
    public void test1() throws IOException {

        SqlSession sqlSession = MybatisUtil.getSqlSession();

        // 4. Mapper接口中的抽象方法，是由 Mybatis 实现的。
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //  调用 Mapper 接口对象的方法，去执行sql语句获取结果就 ok
        List<User> users = mapper.selectAll();

        User user = mapper.selectById(7);

        System.out.println("user = " + user);
        System.out.println("users = " + users);
    }

    @Test
    public void test2(){
        // 测试 根据用户名 查找用户
        String username  = "admin";

        // 1.获取SelSession
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        // 2. 通过 SqlSession 来创建 Mapper 接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        // 3. 调用方法执行查询
        User user = mapper.selectByUsername(username);

        System.out.println("user = " + user);

        // 4. 关闭 SqlSession
        sqlSession.close();

    }

    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int id = 12;
        String newPass = "333";

        int i = mapper.changePassword(id, newPass);
        // 提交修改
        sqlSession.commit();

        System.out.println("i = " + i);
    }

    @Test
    public void test4(){
        // 测试插入数据
        // Mybatis 是默认开启事务的，
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        boolean b = mapper.add("aabbcc", "123123", "aabbcc@qq.com");
        // 手动提交事务
        sqlSession.commit();

        System.out.println("b = " + b);

        sqlSession.commit();
    }

    @Test
    public void test5(){
        // 测试删除数据
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteById(33);

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void test6(){
        // 测试删除数据
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int id = 27;
        String username = "ppp";
        String password = "ppp";
        String email = "ppp@123.com";

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);

        boolean update = mapper.update(id, user);

        System.out.println("update = " + update);

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void test7(){
        // 测试删除数据
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        String username = "xtttttty";
        String password = "888999";
        String email = "xtttttty@123.com";

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);

        boolean update = mapper.addUser(user);
        System.out.println("update = " + update);

        sqlSession.commit();
        sqlSession.close();

    }




}
