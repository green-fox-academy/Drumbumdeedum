package com.greenfox.messageservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageServiceApplication implements CommandLineRunner {

	@Autowired
	MessageProcessor messageProcessor;

	public static void main(String[] args) {
		SpringApplication.run(MessageServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		messageProcessor.processMessage("Hi Barba, How are you?", "office@greenfox.com");
	}
}
