package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.models.Assignee;

import java.util.List;

public interface AssigneeService {

  void save(Assignee assignee);

  Assignee getOneAssignee(String id);

  List<Assignee> getAssignees();

  void deleteAssignee(Assignee assignee);

  void saveAllAssignees();

}
