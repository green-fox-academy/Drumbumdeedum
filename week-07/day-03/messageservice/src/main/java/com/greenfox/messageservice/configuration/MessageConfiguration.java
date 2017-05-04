package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.service.EmailService;
import com.greenfox.messageservice.MessageProcessor;
import com.greenfox.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

  public EmailService email() {
    return new EmailService();
  }

  public TwitterService twitter() {
    return new TwitterService();
  }

  //switch Bean annotation below by uncommenting/commenting @Bean annotations

  //@Bean
  public MessageProcessor emailProcessor() {
    return new MessageProcessor(email());
  }

  @Bean
  public MessageProcessor twitterProcessor() {
    return new MessageProcessor(twitter());
  }
}
