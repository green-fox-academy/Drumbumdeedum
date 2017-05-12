package com.greenfox.dszalay.RedditApp.controllers;

import com.greenfox.dszalay.RedditApp.models.*;
import com.greenfox.dszalay.RedditApp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

  @PutMapping("/post/{id}/upvote")
  public Post upVote(@PathVariable long id) {
    Post post = repository.findOne(id);
    post.setScore(post.getScore()+1);
    repository.save(post);
    return post;
  }

  @PutMapping("/post/{id}/downvote")
  public Post downVote(@PathVariable long id) {
    Post post = repository.findOne(id);
    post.setScore(post.getScore()-1);
    repository.save(post);
    return post;
  }
}
