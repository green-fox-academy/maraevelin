package com.greenfoxacademy.practice.services.client;

import com.greenfoxacademy.practice.models.dtos.Client;

import java.util.List;

public interface ClientService {
  Client findClientById(long id);
  List<Client> findAllClients();
  void saveClient(Client client);
  boolean isClientNameValid(String name);
  boolean isClientNameAvailable(String name);
}
