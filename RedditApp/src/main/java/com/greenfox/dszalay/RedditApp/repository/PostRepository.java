package com.greenfox.dszalay.RedditApp.repository;

import com.greenfox.dszalay.RedditApp.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
