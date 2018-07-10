package com.greenfoxacademy.resttesting.controllers;

import com.greenfoxacademy.resttesting.models.groot_models.GrootTranslator;
import com.greenfoxacademy.resttesting.models.groot_models.GrootTranslatorError;
import com.greenfoxacademy.resttesting.models.yondu_models.YonduArrow;
import com.greenfoxacademy.resttesting.models.yondu_models.YonduArrowError;
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

  @GetMapping("/yondu")
  public ResponseEntity<?> getYondu(@RequestParam(value = "distance", required = false) Double distance, @RequestParam(value = "time", required = false) Double time) {
    if (distance == null || time == null) {
      return new ResponseEntity(new YonduArrowError("Mising parameter"), HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity(new YonduArrow(distance, time), HttpStatus.OK);
  }

}
