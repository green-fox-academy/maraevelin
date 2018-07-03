package com.greenfoxacademy.todospring;

import com.greenfoxacademy.todospring.models.Todo;
import com.greenfoxacademy.todospring.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodospringApplication implements CommandLineRunner {

  TodoRepository todoRepository;

  @Autowired
  public TodospringApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodospringApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    todoRepository.save(new Todo("Barni a király"));
  }
}
