package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Assignee;
import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.services.AssigneeServiceImpl;
import com.greenfoxacademy.connectionwithmysql.services.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoServiceImpl todoService;
  AssigneeServiceImpl assigneeService;

  @Autowired
  public TodoController(TodoServiceImpl todoService, AssigneeServiceImpl assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }

  @GetMapping(value={"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoService.getTodos());
    return "todo_list";
  }

  @GetMapping("/actives")
  public String listActiveTodos(Model model) {
    model.addAttribute("todos", todoService.getTodos());
    return "todo_active";
  }

  @GetMapping("/add")
  public String showAdd(Model model) {
    model.addAttribute("newTodo", new Todo());
    return "todo_add";
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
    model.addAttribute("assignees", assigneeService.getAssignees());
    return "todo_edit";
  }

  @PostMapping("/{id}/edit")
  public String edit(@PathVariable(value = "id") Long id, @ModelAttribute Assignee assignee, @ModelAttribute Todo todo) {
    todoService.getOneTodo(id).setAssignee(assignee);
    todoService.save(todo);
    return "redirect:/todo/list";
  }

}