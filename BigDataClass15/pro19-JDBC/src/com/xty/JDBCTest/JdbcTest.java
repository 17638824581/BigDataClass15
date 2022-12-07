package com.xty.JDBCTest;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
    public static void main(String[] args) throws SQLException {
        // jdbc（java连接数据库）
        // jdbc程序大致流程：

        // 通过java程序，向 student 表中 插入数据

        // jar 包，就是一个压缩包，里面包含了其他组织所些的一些java代码
        // 1. 将数据库驱动（下载到的jar包）导入项目中
        // 1.1 在项目中创建一个名为 “libs” 的文件夹,一般用来存放我们java项目中需要用到的 jar 包
        // 1.2 将下载到的 jar 包，复制到 libs 文件夹中
        // 1.3 再将 jar 包 “添加为库”

        // 2. 加载并注册 mysql驱动
        // 需要使用到Driver类，来加载并注册驱动
        // 2.1 创建 Driver 对象
        Driver driver = new Driver();
        // 2.2 使用 DriverManager.registerDriver() 方法来注册驱动
        DriverManager.registerDriver(driver);

        // 3. 提供连接数据库的 url、用户名、密码
        // 3.1 提供URL（网址）
        //  通过jdbc连接数据库的 URL 的组成：jdbc:mysql://主机名:端口号/数据库名
        String url = "jdbc:mysql://localhost:3306/mysql_test";
        String user = "root";
        String password = "123";

        // 4. 获取连接
        // 4.1 通过 DriverManager 来获取连接
        // 获取到的数据库连接对象就是  Connection 对象
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("connection = " + connection);

        // 5. 通过连接对象(Connection对象)创建 Statement对象
        Statement statement = connection.createStatement();

        // 6. 通过 Statement 对象执行 sql 语句，并获取执行结果
        // 6.1 先把要执行的sql语句准备好
        String sql1 = "insert into student(`s_name`,`s_birthday`,`s_sex`) values('王霸','1998-5-2','男')";
        String sql2 = "insert into student(`s_name`,`s_birthday`,`s_sex`) values('李狗蛋','1999-5-2','男')";

        // 6.2 通过 Statement 对象的 execute() 方法，就可以执行我们的sql语句
        // 调用 execute() 方法后，就会的得到执行结果
        boolean b1 = statement.execute(sql1);
        System.out.println(b1);
        boolean b2 = statement.execute(sql2);
        System.out.println(b2);

        // 7. 释放资源
        // 7.1 关闭 Statement 对象
        statement.close();
        // 7.2 关闭 Connection 对象
        connection.close();
    }
}
