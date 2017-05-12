package com.example.todomysql.controller;

import com.example.todomysql.repository.Repository;
import com.example.todomysql.todo.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @RequestMapping(value = "/addtodo")
  public  String addtodo(Model model, String newTodo) {
    if (!newTodo.equals("")) {
      repository.save(new ToDo(newTodo));
    }
    model.addAttribute("todos", repository.findAll());
    return "redirect:/listall/";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable long id, Model model) {
    repository.delete(id);
    model.addAttribute("todos", repository.findAll());
    return"redirect:/listall/";
  }

  @GetMapping("/{id}/edit")
  public String editElement(@PathVariable long id, Model model) {
    model.addAttribute("todo", repository.findOne(id));
    return "edit";
  }

  @PostMapping("/save")
  public String save(Model model, @RequestParam long id, String title, boolean isDone, boolean isUrgent) {
    model.addAttribute("todo", repository.findOne(id));
    ToDo toDo = repository.findOne(id);
    toDo.setTitle(title);
    toDo.setDone(isDone);
    toDo.setUrgent(isUrgent);
    repository.save(toDo);
    return("redirect:/listall/");
  }
}
