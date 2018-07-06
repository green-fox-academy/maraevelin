package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

  PostServiceImpl postService;
  PostRepository postRepository;

  @Autowired
  public PostController(PostServiceImpl postService, PostRepository postRepository) {
    this.postService = postService;
    this.postRepository = postRepository;
  }

  @GetMapping("")
  public String showIndex(Model model) {
    model.addAttribute("posts", postRepository.findAllByOrderByVotesDesc());
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
    post.getUpvoted();
    postService.save(post);
    return "redirect:/";
  }

  @PostMapping("/{id}/downvote")
  public String downvotePost(@PathVariable("id") Long id) {
    Post post = postService.getPost(id);
    post.getDownvoted();
    postService.save(post);
    return "redirect:/";
  }

}
