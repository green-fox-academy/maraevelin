package com.greenfoxacademy.todospring.repo;

import com.greenfoxacademy.todospring.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
