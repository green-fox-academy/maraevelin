package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.models.Assignee;
import com.greenfoxacademy.connectionwithmysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class AssigneServiceImpl implements AssigneeService {

  AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneServiceImpl(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public void save(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  @Override
  public Assignee getOneAssignee(Long id) {
    return assigneeRepository.findById(id).get();
  }

  @Override
  public List<Assignee> getAssignees() {
    List<Assignee> assignees = new ArrayList<>();
    assigneeRepository.findAll().forEach(assignees::add);
    return assignees;
  }

  @Override
  public void deleteAssignee(Assignee assignee) {
    assigneeRepository.delete(assignee);
  }
}
