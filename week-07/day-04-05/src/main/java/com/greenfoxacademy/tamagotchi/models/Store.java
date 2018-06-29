package com.greenfoxacademy.tamagotchi.models;

import java.util.ArrayList;
import java.util.List;

public class Store {
  private List<String> trickStore;
  private List<String> foodStore;
  private List<String> drinkStore;


  public Store() {
    this.trickStore = new ArrayList<>();
    trickStore.add("reads a lot");
    trickStore.add("does java");
    trickStore.add("stops javascript");
    trickStore.add("helps an old person");
    trickStore.add("fights crime");
    trickStore.add("steals a kid's candy");


    this.foodStore = new ArrayList<>();
    foodStore.add("chicken and rice");
    foodStore.add("beef and grilled veggies");
    foodStore.add("lamb and zucchini");
    foodStore.add("gyros");
    foodStore.add("mush-mush");
    foodStore.add("beansoup");
    foodStore.add("grandma's love package with a slice of pizza");

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

  public List<String> getTrickStore() {
    return trickStore;
  }

  public List<String> getFoodStore() {
    return foodStore;
  }

  public List<String> getDrinkStore() {
    return drinkStore;
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
