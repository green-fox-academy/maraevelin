package com.greenfoxacademy.frontend.moduls;

public class DoUntilError {

  private String error;

  public DoUntilError() {
    error = "Please provide a number!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
