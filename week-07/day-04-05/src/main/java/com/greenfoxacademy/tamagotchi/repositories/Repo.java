package com.greenfoxacademy.tamagotchi.repositories;

import com.greenfoxacademy.tamagotchi.models.Fox;

public interface Repo {

  void save(Fox fox);

  Fox findFox(String foxName);

}
