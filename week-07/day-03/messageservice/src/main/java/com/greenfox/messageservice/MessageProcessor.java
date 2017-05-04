package com.greenfox.messageservice;

import com.greenfox.messageservice.service.MessageService;


public class MessageProcessor {

  MessageService service;

  public MessageProcessor(MessageService service) {
    this.service = service;
  }

  public void processMessage(String text, String address) {
    service.sendMessage(text, address);
  }
}
