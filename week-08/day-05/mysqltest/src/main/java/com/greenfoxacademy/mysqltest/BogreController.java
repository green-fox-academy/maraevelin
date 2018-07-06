package com.greenfoxacademy.mysqltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BogreController {

  @Autowired
  BogreRepository bogreRepository;

  @GetMapping
  @ResponseBody
  public String showHello() {
    bogreRepository.save(new Bogre());
    return "gello";
  }

}
