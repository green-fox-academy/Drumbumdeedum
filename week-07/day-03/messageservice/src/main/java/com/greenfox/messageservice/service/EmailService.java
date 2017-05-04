package com.greenfox.messageservice.service;

public class EmailService implements MessageService {

  @Override
  public void sendMessage(String text, String address) {
    System.out.println("Email sent to " + address + " with Message: " + text);
  }
}
