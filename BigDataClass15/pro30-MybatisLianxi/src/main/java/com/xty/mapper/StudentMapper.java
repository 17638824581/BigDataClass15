package com.xty.mapper;

import com.xty.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import javax.servlet.annotation.HandlesTypes;
import java.util.List;

public interface StudentMapper {

    @Select("select * from student")
    List<Student> selectAll();

    @Insert("insert into student(name, age, birthday) values(#{name},#{age},#{birthday})")
    boolean add(Student student);
}
