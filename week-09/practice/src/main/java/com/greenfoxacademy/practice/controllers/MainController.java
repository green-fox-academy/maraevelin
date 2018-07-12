package com.greenfoxacademy.practice.controllers;

import com.greenfoxacademy.practice.models.dtos.*;
import com.greenfoxacademy.practice.services.client.ClientServiceImpl;
import com.greenfoxacademy.practice.services.log.LogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  LogServiceImpl logService;
  ClientServiceImpl clientService;

  @Autowired
  public MainController(ClientServiceImpl clientService) {
    this.clientService = clientService;
  }

  @GetMapping("/")
  public String renderMainPage() {
    logService.saveLogMessage(new Log("INFO", "Request /", "GET", ""));
    return "main";
  }

  @GetMapping("/register")
  public String renderRegisterPage() {
    logService.saveLogMessage(new Log("INFO", "Request /register", "GET", ""));
    return "register";
  }

  @PostMapping("/register")
  public String registerNewClient(@ModelAttribute(value = "username") String username, Model model) {
    if (!clientService.isClientNameValid(username)) {
      model.addAttribute("invalidName", "error, choose a name!");
      logService.saveLogErrorMessage(new Log("ERROR", "Request /register", "POST", "username=username"));
      return "register";
    } else if (clientService.isClientNameAvailable(username)) {
      clientService.saveClient(new Client(username));
      logService.saveLogErrorMessage(new Log("INFO", "Request /register", "POST", "username=username"));
      return "redirect:/";
    } else {
      model.addAttribute("takenName", "someone is already  using that name");
      logService.saveLogMessage(new Log("INFO", "Request /register", "POST", "username=username"));
      return "register";
    }
  }
}
