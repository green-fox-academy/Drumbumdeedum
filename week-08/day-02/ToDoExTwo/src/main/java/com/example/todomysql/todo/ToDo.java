package com.example.todomysql.todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todos")
public class ToDo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean isUrgent = false;
  private boolean isDone = false;

  public ToDo() {

  }

  public ToDo(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public long getId() {
    return id;
  }

  public boolean isDone() {
    return isDone;
  }

  public boolean isUrgent() {
    return isUrgent;
  }
}
