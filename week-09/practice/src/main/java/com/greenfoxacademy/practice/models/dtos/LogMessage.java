package com.greenfoxacademy.practice.models.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class LogMessage {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonIgnore
  private long id;
  @CreationTimestamp
  private Date timestamp;
  private String logLevel;
  private String path;
  private String method;
  private String requestData;

  public LogMessage() {
  }

  public LogMessage(Date timestamp, String logLevel, String path, String method, String requestData) {
    this.timestamp = timestamp;
    this.logLevel = logLevel;
    this.path = path;
    this.method = method;
    this.requestData = requestData;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public String getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(String logLevel) {
    this.logLevel = logLevel;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public String getRequestData() {
    return requestData;
  }

  public void setRequestData(String requestData) {
    this.requestData = requestData;
  }
}
