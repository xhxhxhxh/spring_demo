package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Properties;

//@Component
@Service
public class BookServiceImpl implements BookService {
  @Autowired
//  @Qualifier("") 指定名称
  private BookDao bookDao;
//  @Value("张三")
  @Value("${name}")
  private String name;
  private int[] ages;
  private Map<String, String> myMap;
  private Properties myProperties;
  @Override
  public void save() {
    bookDao.save();
    System.out.println("BookService save" + name);
//    System.out.println("ages" + Arrays.toString(ages));
//    System.out.println("myMap" + myMap.toString());
//    System.out.println("myProperties" + myProperties.toString());
  }

  public void setBookDao(BookDao bookDao) {
    this.bookDao = bookDao;
  }

  public void init() {
    System.out.println("init");
  }

  public void destroy() {
    System.out.println("destroy");
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAges(int[] ages) {
    this.ages = ages;
  }

  public void setMyMap(Map<String, String> myMap) {
    this.myMap = myMap;
  }

  public void setMyProperties(Properties myProperties) {
    this.myProperties = myProperties;
  }
}
