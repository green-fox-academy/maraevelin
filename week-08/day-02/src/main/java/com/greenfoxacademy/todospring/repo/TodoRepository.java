package com.greenfoxacademy.todospring.repo;

import com.greenfoxacademy.todospring.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
