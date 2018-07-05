package com.greenfoxacademy.connectionwithmysql.models;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private static String date = new SimpleDateFormat("yyyy/MM/dd. HH:mm:ss").format(new Date());
  private String title;
  private boolean isUrgent = false;
  private boolean isDone = false;
  @ManyToOne
  Assignee assignee = new Assignee();

  public Todo() {
  }

  public Todo(String title) {
    this(title, false, false);
  }

  public Todo(String title, boolean isUrgent, boolean isDone) {
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean getIsUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(boolean isUrgent) {
    this.isUrgent = isUrgent;
  }

  public boolean getIsDone() {
    return isDone;
  }

  public void setIsDone(boolean isDone) {
    this.isDone = isDone;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean done) {
    isDone = done;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }
}
