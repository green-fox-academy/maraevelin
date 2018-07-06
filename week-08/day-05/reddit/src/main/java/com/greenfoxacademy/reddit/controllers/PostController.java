package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
//import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

  @Autowired
  PostRepository postRepository;

//  PostServiceImpl postService;
//
//  @Autowired
//  public PostController(PostServiceImpl postService) {
//    this.postService = postService;
//  }

  @GetMapping("")
  public String showIndex(Model model) {
    model.addAttribute("posts", postRepository.findAll());
    return "index";
  }

  @GetMapping("/submit")
  public String showSubmit(Model model) {
    model.addAttribute("newPost", new Post());
    return "submit";
  }

  @PostMapping("/submit")
  public String submitNewPost(@ModelAttribute Post post) {
    postRepository.save(post);
    return "index";
  }

}
