package com.greenfoxacademy.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

  @Bean
  public HelloWorld getHello() {
    return new HelloWorld();
  }
}
