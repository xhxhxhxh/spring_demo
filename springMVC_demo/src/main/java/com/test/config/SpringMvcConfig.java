package com.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

//@Configuration
@ComponentScan("com.test.controller")
public class SpringMvcConfig {
}
