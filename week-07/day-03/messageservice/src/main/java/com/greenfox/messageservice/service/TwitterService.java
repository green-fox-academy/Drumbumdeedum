package com.greenfox.messageservice.service;

public class TwitterService implements MessageService {

  @Override
  public void sendMessage(String text, String address) {
    System.out.println("Tweeted to " + address + " with Message: " + text);
  }
}
