package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Assignee;
import com.greenfoxacademy.connectionwithmysql.services.AssigneeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  AssigneeServiceImpl assigneeService;

  @Autowired
  public AssigneeController(AssigneeServiceImpl assigneeService) {
    this.assigneeService = assigneeService;
  }

  @GetMapping(value={"/", "/list"})
  public String showAssigneeList(Model model) {
    model.addAttribute("assignees", assigneeService.getAssignees());
    return "assignee_list";
  }

  @GetMapping("/add")
  public String showAddAssignee(Model model) {
    model.addAttribute("newAssignee", new Assignee());
    return "assignee_add";
  }

  @PostMapping("/add")
  public String addAssignee(@ModelAttribute Assignee assignee) {
    assigneeService.save(assignee);
    return "redirect:/assignee/";
  }

  @PostMapping("/delete")
  public String delete(@RequestParam(value = "id") String id) {
    assigneeService.deleteAssignee(assigneeService.getOneAssignee(id));
    return "redirect:/assignee/";
  }

  @GetMapping("/{id}/edit")
  public String showEdit(@PathVariable(value = "id") String id, Model model) {
    model.addAttribute("assignee", assigneeService.getOneAssignee(id));
    return "assignee_edit";
  }

  @PostMapping("/{id}/edit")
  public String edit(@PathVariable(value = "id") Long id, @ModelAttribute Assignee assignee) {
    assigneeService.save(assignee);
    return "redirect:/assignee/";
  }

}