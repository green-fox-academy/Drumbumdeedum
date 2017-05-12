package com.greenfox.dszalay.RedditApp.models;

import org.springframework.stereotype.Component;

@Component
public class PostList {
  Iterable<Post> posts;

  public void setPosts(Iterable<Post> posts) {
    this.posts = posts;
  }

  public Iterable<Post> getPosts() {
    return posts;
  }
}
