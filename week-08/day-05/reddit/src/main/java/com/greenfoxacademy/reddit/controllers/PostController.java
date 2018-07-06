package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Controller
public class PostController {

  PostServiceImpl postService;

  @Autowired
  public PostController(PostServiceImpl postService) {
    this.postService = postService;
  }


  
}
