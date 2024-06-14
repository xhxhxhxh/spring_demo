package org.example;

import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    context.registerShutdownHook(); // 注册关闭钩子
    BookService bookService = (BookService) context.getBean("bookService"); // bookService为bean的name
    BookService bookService2 = (BookService) context.getBean("s2");
    bookService.save();
//    context.close();
    System.out.println(bookService);
    System.out.println(bookService2);
  }
}
