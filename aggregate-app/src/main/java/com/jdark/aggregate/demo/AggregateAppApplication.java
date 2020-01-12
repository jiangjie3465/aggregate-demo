package com.jdark.aggregate.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jiangjie
 */
@MapperScan(basePackages = {"com.jdark.aggregate.demo.dao"})
@SpringBootApplication
public class AggregateAppApplication {

  public static void main(String[] args) {
    SpringApplication.run(AggregateAppApplication.class, args);
  }

}
