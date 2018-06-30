package com.greenfoxacademy.tamagotchi.models.stores;

import java.util.ArrayList;
import java.util.List;

public class DrinkStore {
  private List<String> drinkStore;

  public DrinkStore() {
    this.drinkStore = new ArrayList<>();
    drinkStore.add("water");
    drinkStore.add("milk with coffee");
    drinkStore.add("hot cocoa");
    drinkStore.add("extra strong mint tea");
    drinkStore.add("banana shake");
    drinkStore.add("vegetable-fruit smoothie");
    drinkStore.add("green smothie");
    drinkStore.add("virginblood");
  }

  public List<String> getDrinkStore() {
    return drinkStore;
  }

  public void setDrinkStore(List<String> drinkStore) {
    this.drinkStore = drinkStore;
  }
}