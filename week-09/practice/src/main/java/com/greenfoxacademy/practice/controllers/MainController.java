package com.greenfoxacademy.practice.controllers;

import com.greenfoxacademy.practice.models.dtos.*;
import com.greenfoxacademy.practice.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  LogServiceImpl logService;

  @Autowired
  public MainController(LogServiceImpl logService) {
    this.logService = logService;
  }

  @GetMapping("/")
  public String renderMainPage() {
    logService.printLog(new Log("INFO", "Request /", "GET", ""));
    return "main";
  }

}
