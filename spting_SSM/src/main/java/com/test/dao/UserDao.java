package com.test.dao;

import com.test.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
  @Select("select * from user_tb")
  List<User> checkAll();
}
