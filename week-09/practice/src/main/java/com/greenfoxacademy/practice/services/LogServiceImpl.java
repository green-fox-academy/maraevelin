package com.greenfoxacademy.practice.services;

import com.greenfoxacademy.practice.models.dtos.Log;
import com.greenfoxacademy.practice.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

  LogRepository logRepository;

  @Autowired
  public LogServiceImpl(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @Override
  public void printLog(Log log) {
    logRepository.save(log);
    System.out.println(log.createLogMessage());
  }

  @Override
  public void printLogError(Log log) {
    logRepository.save(log);
    System.err.println(log.createLogMessage());
  }
}
