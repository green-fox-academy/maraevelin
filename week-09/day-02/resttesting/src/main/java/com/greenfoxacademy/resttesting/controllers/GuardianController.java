package com.greenfoxacademy.resttesting.controllers;

import com.greenfoxacademy.resttesting.models.dbrelated.*;
import com.greenfoxacademy.resttesting.models.servicerelated.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity<?> getGroot(@RequestParam(value = "message", required = false) String somemessage) {
    if (somemessage == null) {
      return new ResponseEntity(new GrootTranslatorError("I am Groot!"), HttpStatus.BAD_REQUEST);
    } else {
      return new ResponseEntity(new GrootTranslator(somemessage), HttpStatus.OK);
    }
  }
}
