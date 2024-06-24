package com.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

@Configuration
// 排除controller文件夹
//@ComponentScan(value = "com.test")
@ComponentScan(value = {"com.test"}, excludeFilters = @ComponentScan.Filter(
    type = FilterType.ANNOTATION,
    classes = Controller.class
))
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}
