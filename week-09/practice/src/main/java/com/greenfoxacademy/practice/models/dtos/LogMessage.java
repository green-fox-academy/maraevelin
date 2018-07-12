package com.greenfoxacademy.practice.models.dtos;

import java.util.Date;

public class LogMessage {
  private Date timestamp;
  private String logLevel;
  private String path;
  private String method;
  private String requestData;
}
