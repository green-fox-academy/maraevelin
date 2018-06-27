package com.greenfoxacademy.dependency.printer;

import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("I'm red");
  }
}
