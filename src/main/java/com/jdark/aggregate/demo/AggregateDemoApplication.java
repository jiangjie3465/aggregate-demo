package com.jdark.aggregate.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(basePackages = {"com.jdark.aggregate.demo.dao"})
@SpringBootApplication
public class AggregateDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(AggregateDemoApplication.class, args);
  }

}
