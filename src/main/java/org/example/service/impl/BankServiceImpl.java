package org.example.service.impl;

import org.example.dao.mapper.BankDao;
import org.example.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService {
  @Autowired
  private BankDao bankDao;

  @Override
  public void transfer(String out, String in, int money) {
    bankDao.reduceMoney(out, money);
    int i = 1 / 0;
    bankDao.addMoney(in, money);
  }
}
