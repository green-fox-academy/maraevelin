package com.greenfoxacademy.tamagotchi.models.stores;

import java.util.ArrayList;
import java.util.List;

public class FoodStore {
  private List<String> foodStore;

  public FoodStore() {
    this.foodStore = new ArrayList<>();
    foodStore.add("chicken and rice");
    foodStore.add("beef and grilled veggies");
    foodStore.add("lamb and zucchini");
    foodStore.add("gyros");
    foodStore.add("mush-mush");
    foodStore.add("beansoup");
    foodStore.add("grandma's love package with a slice of pizza");
  }

  public List<String> getFoodStore() {
    return foodStore;
  }

  public void setFoodStore(List<String> foodStore) {
    this.foodStore = foodStore;
  }
}
