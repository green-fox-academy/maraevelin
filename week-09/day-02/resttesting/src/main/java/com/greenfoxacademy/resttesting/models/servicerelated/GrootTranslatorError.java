package com.greenfoxacademy.resttesting.models.servicerelated;

public class GrootTranslatorError {
  private String error;

  public GrootTranslatorError() {
  }

  public GrootTranslatorError(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
