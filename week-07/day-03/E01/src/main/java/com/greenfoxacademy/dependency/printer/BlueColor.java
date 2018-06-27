package com.greenfoxacademy.dependency.printer;

import org.springframework.beans.factory.annotation.Autowired;

public class BlueColor implements MyColor {
  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("blue");
  }
}
