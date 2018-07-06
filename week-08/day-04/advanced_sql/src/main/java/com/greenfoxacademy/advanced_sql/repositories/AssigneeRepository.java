package com.greenfoxacademy.advanced_sql.repositories;

import com.greenfoxacademy.advanced_sql.models.Assignee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

  List<Assignee> findAll();

}
