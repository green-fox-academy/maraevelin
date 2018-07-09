package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.moduls.doubling.Doubling;
import com.greenfoxacademy.frontend.moduls.doubling.ErrorMessage;
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
}
