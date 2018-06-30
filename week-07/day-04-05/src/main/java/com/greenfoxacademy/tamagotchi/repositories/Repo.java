package com.greenfoxacademy.tamagotchi.repositories;

import com.greenfoxacademy.tamagotchi.models.Fox;

import java.util.List;

public interface Repo {

  void save(String foxName);

  Fox findFox(String foxName);

  List<String> getDrinksFromDrinkStore();

  List<String> getFoodFromFoodStore();

  List<String> getTricksFromTrickStore();

  void addNewDrink(String newDrink);

  void addNewFood(String newFood);

  void addNewTrick(String newTrick);

}
