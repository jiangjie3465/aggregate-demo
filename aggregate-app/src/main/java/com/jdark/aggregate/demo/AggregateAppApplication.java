package com.jdark.aggregate.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author jiangjie
 */
@MapperScan(basePackages = {"com.jdark.aggregate.demo.dao"})
@SpringBootApplication(scanBasePackages = {"com.jdark.aggregate"})
public class AggregateAppApplication {



  public static void main(String[] args) {
    ConfigurableApplicationContext run = SpringApplication.run(AggregateAppApplication.class, args);
  }



}
