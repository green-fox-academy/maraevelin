package com.greenfoxacademy.tamagotchi.services;

import com.greenfoxacademy.tamagotchi.models.Fox;

import java.util.List;

public interface FoxService {

  void login(String foxName);

  Fox getFox(String foxName);

  int countKnownTricks(String foxName);

  List<String> getFoodStore();

  List<String> getDrinkStore();

  List<String> getTrickStore();

  void changeDiet(String foxName, String otherFood, String otherDrink);

}
