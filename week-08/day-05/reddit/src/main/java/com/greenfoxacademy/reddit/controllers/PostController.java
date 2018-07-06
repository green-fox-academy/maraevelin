package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

  PostServiceImpl postService;

  @Autowired
  public PostController(PostServiceImpl postService) {
    this.postService = postService;
  }

  @GetMapping("")
  public String showIndex(Model model) {
    model.addAttribute("posts", postService.getPosts());
    return "index";
  }

  @GetMapping("/submit")
  public String showSubmit(Model model) {
    model.addAttribute("newPost", new Post());
    return "submit";
  }

  @PostMapping("/submit")
  public String submitNewPost(@ModelAttribute Post post) {
    postService.save(post);
    return "redirect:/";
  }

  @PostMapping("/{id}/upvote")
  public String upvotePost(@PathVariable("id") Long id) {
    Post post = postService.getPost(id);
    post.setLikes(post.getLikes() + 1);
    postService.save(postService.getPost(id));
    return "redirect:/";
  }

  @PostMapping("/{id}/downvote")
  public String downvotePost(@PathVariable("id") Long id) {
    Post post = postService.getPost(id);
    post.setLikes(post.getLikes() - 1);
    postService.save(postService.getPost(id));
    return "redirect:/";
  }

}
