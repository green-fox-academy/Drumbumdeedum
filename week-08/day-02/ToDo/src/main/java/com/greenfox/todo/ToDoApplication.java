package com.greenfox.todo;

import com.greenfox.todo.repository.Repository;
import com.greenfox.todo.todo.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoApplication implements CommandLineRunner {

	@Autowired
	Repository repository;

	public static void main(String[] args) {
		SpringApplication.run(ToDoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new ToDo("I have to learn Object Relational Mapping"));
		repository.save(new ToDo("I just learned Object Relational Mapping"));
		repository.save(new ToDo("Fuck this, I'm awesome!"));

	}
}
