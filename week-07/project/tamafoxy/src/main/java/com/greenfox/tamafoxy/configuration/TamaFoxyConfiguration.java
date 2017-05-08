package com.greenfox.tamafoxy.configuration;

import com.greenfox.tamafoxy.Models.Fox;
import com.greenfox.tamafoxy.Models.TrickList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TamaFoxyConfiguration {

  @Bean
  public Fox getFox() {
    return new Fox();
  }

  @Bean
  public TrickList getTrickList() {
    return new TrickList();
  }
}
