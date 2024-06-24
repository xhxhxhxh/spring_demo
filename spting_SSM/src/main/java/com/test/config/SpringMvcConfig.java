package com.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@Configuration
@ComponentScan("com.test.controller")
@EnableWebMvc // 开启json转化功能
public class SpringMvcConfig {
}
