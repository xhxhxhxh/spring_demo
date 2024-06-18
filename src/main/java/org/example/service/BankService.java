package org.example.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public interface BankService {
  // 默认只会在error和运行时异常回滚，IOException不会回滚需要配置
  @Transactional(rollbackFor = {IOException.class})
  // @Transactional(propagation = Propagation.REQUIRES_NEW) // 事务传播行为，REQUIRES_NEW会新建事务
  void transfer(String out, String in, int money);
}
