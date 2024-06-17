package org.example;

import org.example.config.SpringConfig;
import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App4 {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    BookDao bookdao = (BookDao) context.getBean("bookDao");
//    bookdao.save();
    BookService bookService = context.getBean(BookService.class);
    System.out.println(bookService);
    bookService.save();
  }
}
