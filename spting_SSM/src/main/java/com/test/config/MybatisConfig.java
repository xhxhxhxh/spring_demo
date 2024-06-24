package com.test.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {
  @Bean
  public SqlSessionFactoryBean SqlSessionFactoryBean(DataSource dataSource) {
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    sqlSessionFactoryBean.setTypeAliasesPackage("com.test.domain");
    sqlSessionFactoryBean.setDataSource(dataSource);
    return sqlSessionFactoryBean;
  }

  @Bean
  public MapperScannerConfigurer MapperScannerConfigurer() {
    MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
    mapperScannerConfigurer.setBasePackage("com.test.dao");
    return mapperScannerConfigurer;
  }
}
