package com.greenfoxacademy.tamagotchi.models;

import java.util.List;

public class Store {
  private List<String> trickStore;
  private List<String> foodStore;
  private List<String> drinkStore;


  public Store(List<String> trickStore, List<String> foodStore, List<String> drinkStore) {
    this.trickStore = trickStore;


    this.foodStore = foodStore;


    this.drinkStore = drinkStore;


  }

  public void expandTrickStore(String newTrick) {
    trickStore.add(newTrick);
  }

  public void expandFoodStore(String newFood) {
    trickStore.add(newFood);
  }

  public void expandDrinkStore(String newDrink) {
    trickStore.add(newDrink);
  }
}
