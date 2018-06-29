package com.greenfoxacademy.tamagotchi.models;

import java.util.List;

public class Fox {
  private String name;
  private List<String> tricks;
  private String food;
  private String drink;

  public Fox(String name) {
    this.name = name;
  }

  public boolean isDoingTricks() {
    return (tricks.size() != 0);
  }

  public void learn(String newTrick) {
    tricks.add(newTrick);
  }

  public void changeFood(String newFood) {
    setFood(newFood);
  }

  public void changeDrink(String newDrink) {
    setDrink(newDrink);
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

  public List<String> getTricks() {
    return tricks;
  }
}
