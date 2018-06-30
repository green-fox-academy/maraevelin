package com.greenfoxacademy.tamagotchi.services;

import com.greenfoxacademy.tamagotchi.models.Fox;

public interface FoxService {

  void login(String foxName);

  Fox getFox(String foxName);

  int countKnownTricks(String foxName);

  void changeDiet(String otherDrink, String otherFood, String foxName);

}
