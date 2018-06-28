package com.greenfoxacademy.tamagotchi.models.creatures;

import java.util.ArrayList;
import java.util.List;

public abstract class Creature {

  private String name;
  private String food;
  private String drink;
  private List<String> tricks;
  private String type;

  public Creature() {
    this.name = "Unkown";
    this.food = "Food";
    this.drink = "Drink";
    this.tricks = new ArrayList<>();
    this.type = getClass().getSimpleName();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void learn(String newTrick) {
    tricks.add(newTrick);
  }
}
