package com.greenfoxacademy.dependency.useful_utilities_controllers;

import java.io.IOException;
import java.util.List;

public interface Safe {

  List<String> findAll();

  void save(String student);

  int count();

  boolean check(String name);

  void backup();

}
