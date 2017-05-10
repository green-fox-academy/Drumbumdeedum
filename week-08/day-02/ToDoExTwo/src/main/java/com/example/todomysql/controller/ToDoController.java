package com.example.todomysql.controller;

import com.example.todomysql.repository.Repository;
import com.example.todomysql.todo.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ToDoController {

  @Autowired
  Repository repository;

  @RequestMapping(value = "/listall")
  public String list(Model model) {
    model.addAttribute("todos", repository.findAll());
    return "todo";
  }

  @RequestMapping(value = "/listundone")
  public String listundone(Model model) {
    model.addAttribute("todos", repository.findAll());
    return "todoundone";
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String listToDo(@RequestParam(required = false) String isActive, Model model) {
    if (isActive != null) {
      model.addAttribute("todos", repository.findByIsDoneEquals(Boolean.parseBoolean(isActive)));
    } else {
      model.addAttribute("todos", repository.findAll());
    }
    return "todo";
  }

  @RequestMapping(value = "/addtodo")
  public  String addtodo(Model model, String newTodo) {
    if (!newTodo.equals("")) {
      repository.save(new ToDo(newTodo));
    }
    model.addAttribute("todos", repository.findAll());
    return "todo";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable long id, Model model) {
    repository.delete(id);
    model.addAttribute("todos", repository.findAll());
    return"todo";
  }
}
