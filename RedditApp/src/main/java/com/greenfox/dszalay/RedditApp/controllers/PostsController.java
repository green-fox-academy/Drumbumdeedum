package com.greenfox.dszalay.RedditApp.controllers;

import com.greenfox.dszalay.RedditApp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {

  @Autowired
  PostRepository repository;

  @RequestMapping("/")
  public String list(Model model) {
    model.addAttribute("posts", repository.findAll());
    return "posts";
  }

  @GetMapping("/addpost")
  public String addPost() {

    return "addpost";
  }

}
