package com.greenfoxacademy.todospring.controllers;

import com.greenfoxacademy.todospring.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping(value={"/", "/list"})
  @ResponseBody
  public String list(Model model) {
    return "This is my first todo";
  }


}
