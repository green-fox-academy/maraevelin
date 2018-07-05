package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.models.Todo;

import java.util.List;

public interface TodoService {

  void save(Todo todo);

  Todo getOneTodo(Long id);

  List<Todo> getTodos();

  void deleteTodo(Todo todo);

  void saveAllTodos();

}
