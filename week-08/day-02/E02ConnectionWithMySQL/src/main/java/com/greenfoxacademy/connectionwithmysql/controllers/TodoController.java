package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.services.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoServiceImpl todoService;

  @Autowired
  public TodoController(TodoServiceImpl todoService) {
    this.todoService = todoService;
  }

  @GetMapping(value={"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoService.getTodos());
    return "todoslist";
  }

  @GetMapping("/actives")
  public String listActiveTodos(Model model) {
    model.addAttribute("todos", todoService.getTodos());
    return "activetodos";
  }

  @GetMapping("/add")
  public String showAdd(Model model) {
    model.addAttribute("newTodo", new Todo());
    return "add";
  }

  @PostMapping("/add")
  public String add(@ModelAttribute Todo todo) {
    todoService.save(todo);
    return "redirect:/todo/list";
  }

  @PostMapping("/delete")
  public String delete(@RequestParam(value = "id") Long id) {
    todoService.deleteTodo(todoService.getOneTodo(id));
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String showEdit(@PathVariable(value = "id") Long id, Model model) {
    model.addAttribute("todo", todoService.getOneTodo(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String edit(@PathVariable(value = "id") Long id, @ModelAttribute Todo todo) {
    todoService.save(todo);
    return "redirect:/todo/list";
  }

//  @PostMapping("/{id}/edit")
//  public String edit(@PathVariable(value = "id") Long id, @ModelAttribute String title) {
//    todoService.updateTodo(id, title);
//    return "redirect:/todo/list";
//  }


}