package com.xty.mapper;

import com.xty.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    // 查询全部学生
    @Select("select * from student")
    List<Student> getAll();

    // 根据id删除学生
    @Select("delete from student where id=#{id}")
    void deleteById(int id);

    // 添加学生
    @Insert("insert into student(name,age,birthday) values (#{name},#{age},#{birthday})")
    void add(Student student);
}
