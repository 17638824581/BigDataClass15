package com.dahua.ConnectionPool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

// 演示如何使用 德鲁伊数据库连接池 来创建数据库连接
public class DruidDataSourceTest {
    public static void main(String[] args) throws Exception {
        // 1. 将 druid 的 jar 包导入项目中

        // 2. 创建数据库连接池，使用 DruidDataSource 类
//        DruidDataSource source = new DruidDataSource();
        
        // 2. 配置数据库连接池的参数，这些参数，我们可以直接使用 配置文件来指定这些参数
        // 可以使用Properties类读取 druid.properties 文件中的配置项
        Properties properties = new Properties();
        properties.load(ClassLoader.getSystemResourceAsStream("druid.properties"));

        // 3. 通过 DruidDataSourceFactory 这个工厂类的 createDataSource() 来使用配置文件创建一个数据库连接池
        DataSource source = DruidDataSourceFactory.createDataSource(properties);

        // 配置数据库连接池使用的 数据库驱动类
//        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        // 配置数据库连接池使用的 url
//        source.setUrl("jdbc:mysql://localhost:3306/jdbc");
//        // 配置连接池使用的 用户
//        source.setUsername("root");
//        // 配置连接池使用的 密码
//        source.setPassword("123");
//        // 配置连接池初始化时生成的连接数量，初始化连接数量为 5 个
//        source.setInitialSize(5);
//        // 配置连接池中最大的连接数量，最大连接数量为20个
//        source.setMaxActive(5);
//        // 配置连接池，获取连接的最大等待时间 5 秒
////        source.setMaxWait(5000);
//        // 配置连接池中，最小的连接空闲时间
//        source.setMinEvictableIdleTimeMillis(3000);

        // 4. 使用数据库连接池获取连接
        // 我们通过数据库连接池获取到的数据库连接对象，不是我们之前常用的 Coneciton 类型
        // 而是 Connection 接口的实现类 DruidPooledConnection
        // DruidPooledConnection 类 实现了  Connection
//        // 我们可以将 DruidPooledConnection 当作 Connection 对象去使用。
//        DruidPooledConnection connection = source.getConnection();
//
//        // 5. 打印数据库连接
//        System.out.println(connection);


        // 做一个实现，来看看，数据库连接池是否真的能够限制我们获取到数据库连接的数量
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                try {
                    Connection connection = source.getConnection();
                    System.out.println(Thread.currentThread().getName()+"子线程获取到连接："+connection);
                    // 模拟这个子线程持有连接3秒钟
                    Thread.sleep(3000);
                    // 3秒钟之后，释放这个连接对象
                    // 将这个数据库连接归还给数据库连接池
                    connection.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }
}
