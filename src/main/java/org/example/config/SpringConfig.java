package org.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {

//  @Bean
//  public DataSource dataSource() {
//    DruidDataSource dataSource = new DruidDataSource();
//    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//    dataSource.setUrl("jdbc:mysql://localhost:3306/db1");
//    dataSource.setUsername("root");
//    dataSource.setPassword("123456");
//    return dataSource;
//  }
}
