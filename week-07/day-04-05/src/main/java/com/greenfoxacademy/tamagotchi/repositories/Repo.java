package com.greenfoxacademy.tamagotchi.repositories;

import com.greenfoxacademy.tamagotchi.models.Fox;

public interface Repo {

  void save(String foxName);

  Fox findFox(String foxName);

}
