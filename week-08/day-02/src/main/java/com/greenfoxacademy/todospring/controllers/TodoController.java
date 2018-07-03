package com.greenfoxacademy.todospring.controllers;

import com.greenfoxacademy.todospring.models.Todo;
import com.greenfoxacademy.todospring.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping(value={"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todo1", new Todo("Start the day"));
    model.addAttribute("todo2", new Todo("Finish H2 workshop1"));
    model.addAttribute("todo3", new Todo("Finish H2 workshop2"));
    model.addAttribute("todo4", new Todo("Create a CRUD project"));
    return "todoslist";
  }


}
