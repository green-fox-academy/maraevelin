package com.greenfoxacademy.tamagotchi.services;

import com.greenfoxacademy.tamagotchi.models.Fox;

public interface FoxService {

  void login(String foxName);

  Fox getFox(String foxName);

}
