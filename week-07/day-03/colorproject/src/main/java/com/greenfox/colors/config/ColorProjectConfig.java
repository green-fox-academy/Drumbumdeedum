package com.greenfox.colors.config;

import com.greenfox.colors.models.Blue;
import com.greenfox.colors.models.Green;
import com.greenfox.colors.models.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorProjectConfig {

  @Bean
  public Red getRed() {
    return new Red();
  }

  @Bean
  public Blue getBlue() {
    return new Blue();
  }

  @Bean
  public Green getGreen() {
    return new Green();
  }
}
