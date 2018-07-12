package com.greenfoxacademy.practice.services;

import com.greenfoxacademy.practice.models.dtos.Log;
import org.springframework.stereotype.Service;

public interface LogService {

  void printLog(Log log);
  void printLogError(Log log);

}
