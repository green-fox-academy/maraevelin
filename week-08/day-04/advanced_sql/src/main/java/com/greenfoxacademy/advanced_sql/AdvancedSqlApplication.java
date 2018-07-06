package com.greenfoxacademy.advanced_sql;

import com.greenfoxacademy.advanced_sql.models.Assignee;
import com.greenfoxacademy.advanced_sql.models.Todo;
import com.greenfoxacademy.advanced_sql.repositories.AssigneeRepository;
import com.greenfoxacademy.advanced_sql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdvancedSqlApplication implements CommandLineRunner {

  private AssigneeRepository assigneeRepository;
  private TodoRepository todoRepository;

  @Autowired
  public AdvancedSqlApplication(AssigneeRepository assigneeRepository, TodoRepository todoRepository) {
    this.assigneeRepository = assigneeRepository;
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(AdvancedSqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Todo todo1 = new Todo("clean up");
    Todo todo2 = new Todo("sleep");
    todoRepository.saveAll(todoRepository.findAll());

    Assignee assignee1 = new Assignee("Barni", "barniakiraly@email.hu");
    assignee1.addTodo(todo1);
    assignee1.addTodo(todo2);
    assigneeRepository.save(assignee1);

    todo1.setAssignee(assignee1);
    todo2.setAssignee(assignee1);
    todoRepository.save(todo1);
    todoRepository.save(todo2);
  }
}
