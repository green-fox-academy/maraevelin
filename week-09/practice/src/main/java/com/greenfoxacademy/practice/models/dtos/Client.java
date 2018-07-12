package com.greenfoxacademy.practice.models.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Client {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonIgnore
  private long ip;
  private String id;

  public Client() {
  }

  public Client(String id) {
    this.id = id;
  }

  public long getIp() {
    return ip;
  }

  public void setIp(long ip) {
    this.ip = ip;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
