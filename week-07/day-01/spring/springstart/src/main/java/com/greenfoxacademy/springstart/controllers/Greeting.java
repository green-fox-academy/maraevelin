package com.greenfoxacademy.springstart.controllers;

public class Greeting {
  long id;
  String content;

  Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

}
