package com.greenfoxacademy.tamagotchi.repositories.repos_sketch;

import com.greenfoxacademy.tamagotchi.models.models_sketch.User;

public interface UserRepository {

  User finOneById(String username);

  void save(User user);

}
