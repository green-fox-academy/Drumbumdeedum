package com.example.todomysql.repository;

import com.example.todomysql.todo.ToDo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<ToDo, Long> {
  List<ToDo> findByIsDoneEquals(boolean done);
}
