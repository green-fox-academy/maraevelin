package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  AtomicLong idCounter = new AtomicLong();

  @RequestMapping
  public Greeting greeting(@RequestParam(value = "name") String name) {
    return new Greeting(idCounter.incrementAndGet(), "Hello, " + name);
    }

}
