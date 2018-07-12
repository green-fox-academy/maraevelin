package com.greenfoxacademy.practice.services.log;

import com.greenfoxacademy.practice.models.dtos.Log;
import org.springframework.stereotype.Service;

public interface LogService {

  void saveLogMessage(Log log);
  void saveLogErrorMessage(Log log);

}
