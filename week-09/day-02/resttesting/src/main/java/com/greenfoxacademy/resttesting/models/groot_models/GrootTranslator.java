package com.greenfoxacademy.resttesting.models.groot_models;

public class GrootTranslator {
  private String received;
  private String translated = "I am Groot!";

  public GrootTranslator() {
  }

  public GrootTranslator(String received) {
    this.received = received;
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
