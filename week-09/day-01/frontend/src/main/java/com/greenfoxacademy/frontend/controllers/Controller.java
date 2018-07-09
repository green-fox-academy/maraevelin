package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.moduls.Doubling;
import com.greenfoxacademy.frontend.moduls.ErrorMessage;
import com.greenfoxacademy.frontend.moduls.WelcomeMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping("/doubling")
  public Object getDoubling(@RequestParam(value = "input", required = false) Integer number) {
    if (number == null) {
    return new ErrorMessage("Please provide an input!");
  }
    return new Doubling(number);
  }

  @GetMapping("/greeter")
  public Object getWelcome(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      return new ErrorMessage("Please provide a name!");
    } else if (title == null) {
      return new ErrorMessage("Please provide a title!");
    }
    return new WelcomeMessage(name, title);
  }

}
