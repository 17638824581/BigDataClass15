package com.xty.mapper;

import com.xty.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
*  UserMapper
*  就类似与我们之前 JDBC 阶段所写的  UserDao 接口
*  我们可以在 UserMapper 中定义好 针对于 user 数据表的操作方法，
* */
public interface UserMapper {

    /*
    *  查询 User 表的所有数据
    * */
    List<User> selectAll();

    /*
    *  通过 id 查询
    * */
    User selectById(int id);

    /*
    *  通过 username 查询
    * */
    User selectByUsername(String username);

    /*
    *  修改 指定 id user 的密码
    *   当sql语句中存在多个参数的情况时，
    *   就需要使用 @Param() 注解给每个参数指定 传入名称。
    *   在写 sql 语句时，就可以通过配置的 参数传入名称来取参数。
    *  @Param() 注解，用在方法的参数前，指定这个参数的传入名称。
     * */
    int changePassword(@Param("i") int id,
                       @Param("ps") String newPassword);

    /*
    *  添加 user
    * */
    boolean add(@Param("username") String username,
                @Param("password") String password,
                @Param("email") String email);

    boolean addUser(User user);

    /*
    *  根据id删除user
    * */
    boolean deleteById(int id);

    /*
    *  修改除 id 外的所有字段
    * */
    boolean update(@Param("id") int id,@Param("user") User user);


}
