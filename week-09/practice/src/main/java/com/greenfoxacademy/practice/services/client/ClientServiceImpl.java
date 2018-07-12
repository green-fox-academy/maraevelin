package com.greenfoxacademy.practice.services.client;

import com.greenfoxacademy.practice.models.dtos.Client;
import com.greenfoxacademy.practice.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

  ClientRepository clientRepository;

  @Autowired
  public ClientServiceImpl(ClientRepository clientRepository) {
    this.clientRepository = clientRepository;
  }

  @Override
  public Client findClientById(long id) {
    return clientRepository.findById(id).get();
  }

  @Override
  public List<Client> findAllClients() {
    return clientRepository.findAll();
  }

  @Override
  public void saveClient(Client client) {
    clientRepository.save(client);
  }

  @Override
  public boolean isClientNameValid(String name) {
    return (!name.isEmpty());
  }

  @Override
  public boolean isClientNameAvailable(String name) {
    if (findAllClients().isEmpty() || isClientNameTaken(name)) {
      return true;
    }
    return false;
  }

  private boolean isClientNameTaken(String name) {
    List<String> takenNames = new ArrayList<>();
    for (Client client : findAllClients()) {
      takenNames.add(client.getId());
    }
    return !takenNames.contains(name);
  }
}
