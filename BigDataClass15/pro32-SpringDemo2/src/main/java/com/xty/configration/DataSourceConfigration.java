package com.xty.configration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.io.IOException;


// 不想让这个类配置到 Spring 容器总，但又想让这个类中的 Bean 注解生效
// 我们可以将这个类标注为 配置类
// 告诉Spring要进行组件扫描
@PropertySource("classpath:jdbc.properties")  // 相当于 <context:property-placeholder location="classpath:jdbc.properties"/>
@Configuration
public class DataSourceConfigration {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;


    @Bean
    public DataSource getDataSource() throws IOException {
        System.out.println("DataSrouce 被创建了！");

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }
}
