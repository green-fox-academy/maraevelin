package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.models.Todo;

import java.util.List;

public interface TodoService {

  Todo createTodo(Todo todo);

  Todo getOneTodo(Long id);

  List<Todo> getTodos();

  void updateTodoTitle(Long id, String title, Boolean isUrgent, Boolean isDone);

  void deleteTodo(Todo todo);

}
