package com.greenfoxacademy.tamagotchi.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private List<String> tricks = new ArrayList<>();
  private String food;
  private String drink;

  public void changeFood(String otherFood) {
    setFood(otherFood);
  }

  public void changeDrink(String otherDrink) {
    setDrink(otherDrink);
  }

  public void learn(String newTrick) {
    tricks.add(newTrick);
  }

  public boolean knowsTricks() {
    return (tricks != null);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
