package com.greenfoxacademy.resttesting.models.yondu_models;

public class YonduArrowError {
  private String message;

  public YonduArrowError() {
  }

  public YonduArrowError(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
