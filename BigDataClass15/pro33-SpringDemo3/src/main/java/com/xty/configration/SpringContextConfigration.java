package com.xty.configration;

/*
*   Spring 主配置类
* */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DataSrouceConfigration.class)
@ComponentScan("com.xty")
public class SpringContextConfigration {
}
