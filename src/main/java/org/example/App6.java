package org.example;

import org.example.config.SpringConfig;
import org.example.service.impl.BrandServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App6 {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    BrandServiceImpl brandService = context.getBean(BrandServiceImpl.class);
    System.out.println(brandService.selectAll());
  }
}
