package org.example.dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface BankDao {
  @Update("update tb1_account set money = money + #{money} where name = #{name}")
  void addMoney(@Param("name") String name, @Param("money") int money);

  @Update("update tb1_account set money = money - #{money} where name = #{name}")
  void reduceMoney(@Param("name") String name, @Param("money") int money);
}
