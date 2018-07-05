package com.greenfoxacademy.connectionwithmysql.models;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long assigneeId;
  private String name;
  private String email;
  @ManyToMany(mappedBy = "assignees")
  private List<Todo> assignedTodos = new ArrayList<>();

  public Assignee() {
  }

  public Long getAssigneeId() {
    return assigneeId;
  }

  public void setAssigneeId(Long assigneeId) {
    this.assigneeId = assigneeId;
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

  public List<Todo> getAssignedTodos() {
    return assignedTodos;
  }

  public void setAssignedTodos(List<Todo> assignedTodos) {
    this.assignedTodos = assignedTodos;
  }
}
