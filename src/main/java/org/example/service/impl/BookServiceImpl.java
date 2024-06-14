package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.dao.impl.BookDaoImpl;
import org.example.service.BookService;

public class BookServiceImpl implements BookService {
  private BookDao bookDao;
  @Override
  public void save() {
    bookDao.save();
    System.out.println("BookService save");
  }

  public void setBookDao(BookDao bookDao) {
    this.bookDao = bookDao;
  }
}
