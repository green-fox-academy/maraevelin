package com.greenfoxacademy.advanced_sql.repositories;

import com.greenfoxacademy.advanced_sql.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAll();

}
