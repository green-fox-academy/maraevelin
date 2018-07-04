package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{

  TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public Todo createTodo(Todo todo) {
    return todoRepository.save(todo);
  }

  @Override
  public Todo getOneTodo(Long id) {
    return todoRepository.findById(id).get();
  }

  @Override
  public List<Todo> getTodos() {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    return todos;
  }

  @Override
  public void updateTodoTitle(Long id, String title, Boolean isUrgent, Boolean isDone) {
    todoRepository.findById(id).get().setTitle(title);
    todoRepository.findById(id).get().setIsUrgent(isUrgent);
    todoRepository.findById(id).get().setIsDone(isDone);
  }

  @Override
  public void deleteTodo(Todo todo) {
    todoRepository.delete(todo);
  }
}
