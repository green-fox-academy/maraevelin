package com.greenfoxacademy.advanced_sql.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String email;
  @OneToMany
  List<Todo> todos = new ArrayList<>();

  public Assignee() {
  }

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public void addTodo(Todo todo) {
    todos.add(todo);
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }
}