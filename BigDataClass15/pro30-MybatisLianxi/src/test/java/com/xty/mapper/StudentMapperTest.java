package com.xty.mapper;

import com.xty.pojo.Student;
import com.xty.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class StudentMapperTest {

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> students = mapper.selectAll();
        System.out.println("students = " + students);

    }

    @Test
    public void testAdd(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        Student student = new Student();
        student.setName("李四");
        student.setAge(18);
        student.setBirthday(new Date());

        boolean add = mapper.add(student);
        System.out.println("add = " + add);

        sqlSession.commit();
        sqlSession.close();
    }
}
