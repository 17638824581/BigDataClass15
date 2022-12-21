package com.xty.StudentDAO;

import java.sql.Connection;
import java.util.List;

// Dao 类指的就是 数据操作对象（Data Access Object）
// Dao 类中就是要实现对数据表的增、删、改、查等操作
// StudentDao 类就是要 针对于 student 表所写的 dao 类
// StudnetDao 类就是来专门操作 student 表的
public class StudentDao extends BaseDao{

    // 添加一个学生，根据一个学生对象，填加往shutdent表中一条数据
    // 将传入的 stu 对象存入 student 表中
    public boolean addStudent(Student stu){
        // 1. 准备好要执行的sql语句
        String sql = "insert into student(`s_name`,`s_sex`,`s_score`,`s_age`) values(?,?,?,?);";
        // 2. 获取数据库连接
        Connection conn = JdbcUtils.getConn();
        // 3. 调用 BaseDao 中的通用方法，来执行我们的 sql 语句
        int update = update(conn, sql, stu.getS_name(), stu.getS_sex(), stu.getS_score(), stu.getS_age());
        // 4. 关闭资源
        JdbcUtils.close(conn);
        // 5. 返回结果
        return update == 1;
    }

    // 添加一个学生
    // 根据提供的学生字段值，添加一条学生数据
    public boolean addStudent(String s_name, String s_sex, double s_score, int s_age){
        // 1. 准备好要执行的sql语句
        String sql = "insert into student(`s_name`,`s_sex`,`s_score`,`s_age`) values(?,?,?,?);";
        // 2. 获取数据库连接
        Connection conn = JdbcUtils.getConn();
        // 3. 调用 BaseDao 中的通用方法，来执行我们的 sql 语句
        int update = update(conn, sql, s_name, s_sex, s_score, s_age);
        // 4. 关闭资源
        JdbcUtils.close(conn);
        // 5. 返回结果
        return update == 1;
    }

    // 根据据 id 删除一条学生数据
    public boolean deleteById(int id){
        // 1. 准备好要执行的sql语句
        String sql = "delete from `student` where `s_id` = ? ;";
        // 2. 获取数据库连接
        Connection conn = JdbcUtils.getConn();
        // 3. 调用 BaseDao 中的通用方法，来执行我们的 sql 语句
        int update = update(conn, sql, id);
        // 4. 关闭资源
        JdbcUtils.close(conn);
        // 5. 返回结果
        return update == 1;
    }

    // 修改学生信息
    // 修改学生信息的时候，我们需要使用到学生的 s_id 作为参照
    // 所以在修改学生信息的时候，不能修改他的 s_id

    // 方法接收一个要修改的数据的 s_id
    // 我们可以使用 newStu 这个对象的属性去覆盖原来的数据
    // 根据 s_id 和新的学生对象，更新一条学生数据
    public boolean updateStudent(int s_id, Student newStu){
        // 1. 准备好要执行的sql语句
        String sql = "update `student` set `s_name` = ? , `s_sex` = ?, `s_score` = ?, `s_age` = ? where `s_id` = ?";
        // 2. 获取数据库连接
        Connection conn = JdbcUtils.getConn();
        // 3. 调用 BaseDao 中的通用方法，来执行我们的 sql 语句
        int update = update(conn, sql, newStu.getS_name(), newStu.getS_sex(), newStu.getS_score(), newStu.getS_age(), s_id);
        // 4. 关闭资源
        JdbcUtils.close(conn);
        // 5. 返回结果
        return update == 1;
    }


    // 查询全部学生
    public List<Student> getAll(){
        // 1. 准备好要执行的sql语句
        String sql = "select * from student;";
        // 2. 获取数据库连接
        Connection conn = JdbcUtils.getConn();
        // 3. 调用 BaseDao 中的通用方法，来执行我们的 sql 语句
        List<Student> students = queryAll(Student.class, conn, sql);
        // 4. 关闭资源
        JdbcUtils.close(conn);
        // 5. 返回结果
        return students;
    }

    // 根据姓名查询学生
    public List<Student> getAllByName(String name){
        // 1. 准备查询语句
        String sql = "select * from `student` where `s_name` = ?";
        // 2. 获取数据库连接
        Connection conn = JdbcUtils.getConn();
        // 3. 调用 BaseDao 中的通用方法，来执行我们的 sql 语句
        List<Student> students = queryAll(Student.class, conn, sql, name);
        // 4. 关闭资源
        JdbcUtils.close(conn);
        // 5. 返回结果
        return students;
    }

    // 根据 id 查询学生
    public Student getById(int id){
        // 1. 准备查询语句
        String sql = "select * from `student` where `s_id` = ?";
        // 2. 获取数据库连接
        Connection conn = JdbcUtils.getConn();
        // 3. 调用 BaseDao 中的通用方法，来执行我们的 sql 语句
        Student student = queryOne(Student.class, conn, sql, id);
        // 4. 关闭资源
        JdbcUtils.close(conn);
        // 5. 返回结果
        return student;
    }
}
