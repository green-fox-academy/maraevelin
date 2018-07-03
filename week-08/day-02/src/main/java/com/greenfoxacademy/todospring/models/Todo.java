package com.greenfoxacademy.todospring.models;

public class Todo {
  Long id;
  String title;
  Boolean urgent;
  Boolean done;

  public Todo(String title) {
    this.title = title;
    this.urgent = false;
    this.done = false;
  }
}
