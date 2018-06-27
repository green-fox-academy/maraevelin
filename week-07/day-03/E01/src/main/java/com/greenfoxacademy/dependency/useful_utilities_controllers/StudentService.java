package com.greenfoxacademy.dependency.useful_utilities_controllers;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements Safe{
  ArrayList<String> names;

  public StudentService() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  @Override
  public List<String> findAll() {
    return names;
  }

  @Override
  public void save(String student) {
    names.add(student);
  }

  @Override
  public int count() {
    return names.size();
  }

  @Override
  public boolean check(String name) {
    return (names.contains("name"));
  }
}
