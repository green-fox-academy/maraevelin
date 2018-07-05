package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMySQLApplication implements CommandLineRunner {

  TodoRepository todoRepository;

  @Autowired
  public ConnectionWithMySQLApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectionWithMySQLApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
  }

}
