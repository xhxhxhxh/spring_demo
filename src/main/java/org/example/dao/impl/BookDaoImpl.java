package org.example.dao.impl;

import org.example.dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookDaoImpl implements BookDao, InitializingBean, DisposableBean {
  @Override
  public void save() {
    System.out.println("BookDao save");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("BookDao destroy");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("BookDao afterPropertiesSet");
  }
}
