package com.greenfox.todo.repository;

import com.greenfox.todo.todo.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<ToDo, Long> {

}
