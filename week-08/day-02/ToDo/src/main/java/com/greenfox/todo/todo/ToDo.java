package com.greenfox.todo.todo;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "todos")
public class ToDo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;

  public ToDo() {

  }

  public ToDo(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }
}
