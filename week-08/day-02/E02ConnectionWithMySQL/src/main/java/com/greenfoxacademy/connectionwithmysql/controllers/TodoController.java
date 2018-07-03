package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping(value={"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todoslist";
  }

  @GetMapping("/actives")
  public String listActiveTodos(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "activetodos";
  }

  @GetMapping("/add")
  public String showAdd(Model model) {
    model.addAttribute("newTodo", new Todo());
    return "add";
  }

  @PostMapping("/add")
  public String add(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }

}