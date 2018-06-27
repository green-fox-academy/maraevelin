package com.greenfoxacademy.dependency.printer;

public class GreenColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("I'm green");
  }
}
