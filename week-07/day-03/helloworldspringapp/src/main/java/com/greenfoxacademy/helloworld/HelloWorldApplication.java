package com.greenfoxacademy.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld hello = factory.getBean(HelloWorld.class);
		hello.setMessage("Hello World!");
		hello.getMessage();
	}
}
