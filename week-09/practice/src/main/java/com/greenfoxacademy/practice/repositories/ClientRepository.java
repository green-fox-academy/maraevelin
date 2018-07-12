package com.greenfoxacademy.practice.repositories;

import com.greenfoxacademy.practice.models.dtos.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

  List<Client> findAll();

}
