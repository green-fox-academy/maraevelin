package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.moduls.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

  @PostMapping("/dountil/{what}")
  public Object getWhat(@RequestBody(required = false) DoUntilUntil doUntilUntil, @PathVariable(value = "what") String what) {
    if (doUntilUntil == null) {
      return new ErrorMessage("Please provide a number!");
    }
    return new DoUntil(what, doUntilUntil.getUntil());
  }

  @PostMapping("/arrays")
  public Object getArrayHandlerResult(@RequestBody(required = false) ArrayHandler arrayHandler) {
    if (arrayHandler.getNumbers() == null) {
      return new ErrorMessage("Please provide numbers!");
    } else if (arrayHandler.getWhat().equals("double")) {
      return new ArrayHandlerListResult(arrayHandler);
    }
    return new ArrayHandlerResult(arrayHandler);
  }

}
