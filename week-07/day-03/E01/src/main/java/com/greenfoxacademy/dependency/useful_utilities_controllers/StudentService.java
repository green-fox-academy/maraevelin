package com.greenfoxacademy.dependency.useful_utilities_controllers;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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

  public List<String> findAll() {
    return names;
  }

  public void save(String student) {
    names.add(student);
  }

  public int count() {
    return names.size();
  }

  public boolean check(String name) {
    return (names.contains("name"));
  }

  public void backup() {
    try {
      Files.write(Paths.get("names.txt"), names);
    } catch (IOException e) {
      System.out.println("no :(");
    }
  }

}
