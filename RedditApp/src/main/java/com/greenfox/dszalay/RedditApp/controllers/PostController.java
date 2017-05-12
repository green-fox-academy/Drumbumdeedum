package com.greenfox.dszalay.RedditApp.controllers;

import com.greenfox.dszalay.RedditApp.models.Post;
import com.greenfox.dszalay.RedditApp.models.PostList;
import com.greenfox.dszalay.RedditApp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  @Autowired
  PostRepository repository;
  @Autowired
  PostList posts;

  @GetMapping("/post")
  public PostList listPosts() {
    posts.setPosts(repository.findAll());
    return posts;
  }

  @PostMapping("/post")
  public void addPost(@RequestBody Post post) {
    repository.save(post);
  }
}
