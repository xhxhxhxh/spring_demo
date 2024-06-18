package org.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

public class JdbcConfig {
  @Bean
  public DataSource dataSource() {
    DruidDataSource dataSource = new DruidDataSource();
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3306/db1");
    dataSource.setUsername("root");
    dataSource.setPassword("123456");
    return dataSource;
  }

  @Bean
  public PlatformTransactionManager transactionManage(DataSource dataSource) {
    DataSourceTransactionManager transactionManage = new DataSourceTransactionManager();
    transactionManage.setDataSource(dataSource);
    return transactionManage;
  }
}
