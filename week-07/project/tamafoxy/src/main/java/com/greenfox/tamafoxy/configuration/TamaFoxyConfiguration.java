package com.greenfox.tamafoxy.configuration;

import com.greenfox.tamafoxy.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TamaFoxyConfiguration {

  @Bean
  public Fox getFox() {
    return new Fox();
  }
}
