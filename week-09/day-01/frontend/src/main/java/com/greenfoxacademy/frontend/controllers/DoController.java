package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.moduls.DoUntil;
import com.greenfoxacademy.frontend.moduls.DoUntilUntil;
import com.greenfoxacademy.frontend.moduls.ErrorMessage;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoController {

  @PostMapping("/dountil/{what}")
  public Object getWhat(@RequestBody(required = false) DoUntilUntil doUntilUntil, @PathVariable(value = "what") String what) {
    if (doUntilUntil == null) {
      return new ErrorMessage("Please provide a number!");
    }
    return new DoUntil(what, doUntilUntil.getUntil());
  }

}
