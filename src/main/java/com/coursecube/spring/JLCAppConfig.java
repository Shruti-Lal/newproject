package com.coursecube.spring;



import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages= {"com.coursecube.spring"})
public class JLCAppConfig {
	@Bean
	public DataSource getDS() {
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/myjlcdb");
		bds.setUsername("root");
		bds.setPassword("ROOT");
		bds.setInitialSize(10);//poolsize
		bds.setMaxActive(15); //activeconnection we want
		return bds;
		
	}
	@Bean
  public JdbcTemplate jdbcTemplate(DataSource ds) {
	  
	return new JdbcTemplate(ds);
	  
  }
}
