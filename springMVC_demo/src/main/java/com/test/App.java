package com.test;

import com.test.config.SpringConfig;
import com.test.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    UserController user = context.getBean(UserController.class);
    System.out.println(user);
  }
}
