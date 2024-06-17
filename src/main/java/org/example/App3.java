package org.example;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
    BookDao bookdao = (BookDao) context.getBean("bookDao");
//    bookdao.save();
    BookService bookService = (BookService) context.getBean(BookService.class);
    bookService.save();
  }
}
