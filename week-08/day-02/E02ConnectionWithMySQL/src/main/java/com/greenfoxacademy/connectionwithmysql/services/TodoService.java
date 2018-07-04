package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.models.Todo;

import java.util.List;

public interface TodoService {

  Todo save(Todo todo);

  Todo getOneTodo(Long id);

  List<Todo> getTodos();

  void updateTodo(Long id, String title);
//  void updateTodo(Long id, String title, boolean isUrgent, boolean isDone);

  void deleteTodo(Todo todo);

}
