package org.example.dao.impl;

import org.example.dao.BookDao;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("bookDao")
@Repository("bookDao")
//@Controller("bookDao")
public class BookDaoImpl implements BookDao {
  @Override
  public void save() {
    System.out.println("BookDao save");
  }

  @PreDestroy
  public void destroy() throws Exception {
    System.out.println("BookDao destroy");
  }

  @PostConstruct
  public void afterPropertiesSet() throws Exception {
    System.out.println("BookDao afterPropertiesSet");
  }
}
