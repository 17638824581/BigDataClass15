package com.xty.configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*
*  作为整个项目的配置类
* */
@Configuration                          // 标准此类为配置类
@ComponentScan("com.xty")               // 配置组件扫描指定扫描的包
@Import(DataSourceConfigration.class)   // 导入其他的配置类
public class SpringContextConfigration {
}
