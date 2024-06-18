package org.example;

import org.example.config.SpringConfig;
import org.example.service.BankService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App8 {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    BankService bankService = context.getBean(BankService.class);
    bankService.transfer("张三", "李四", 100);
  }
}
