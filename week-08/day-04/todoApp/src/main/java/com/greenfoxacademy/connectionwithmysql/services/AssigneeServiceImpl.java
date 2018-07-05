package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.models.Assignee;
import com.greenfoxacademy.connectionwithmysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService {

  AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public void save(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  @Override
  public Assignee getOneAssignee(String id) {
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

  @Override
  public void saveAllAssignees() {
    assigneeRepository.saveAll(assigneeRepository.findAll());
  }
}
