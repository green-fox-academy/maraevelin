package com.greenfoxacademy.tamagotchi.services;

import com.greenfoxacademy.tamagotchi.models.Fox;

import java.util.List;

public interface FoxService {

  void login(String foxName);

  Fox getFox(String foxName);

  int countKnownTricks(String foxName);

  List<String> getFoodStore();

  List<String> getDrinkStore();

  void changeDiet(String foxName, String otherFood, String otherDrink);

  List<String> getNewTricks(String foxName);

  void learnNewTrick(String foxName, String newTrick);

  void addAction(String foxName, String food, String drink);

  void addAction(String foxName, String trick);

}
