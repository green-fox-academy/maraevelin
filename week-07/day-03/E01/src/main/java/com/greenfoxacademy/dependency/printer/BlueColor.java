package com.greenfoxacademy.dependency.printer;

public class BlueColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("I'm blue");
  }
}
