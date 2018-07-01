package com.greenfoxacademy.tamagotchi.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private List<String> tricks;
  private String food;
  private String drink;
  private List<String> history;

  public Fox(String name) {
    this.name = name;
    this.tricks = new ArrayList<>();
    this.history = new ArrayList<>();

  }

  public boolean isDoingTricks() {
    return (tricks.size() != 0);
  }

  public int knownTricks() {
    return tricks.size();
  }

  public String getNameInLine() {
    return name.substring(0,1).toUpperCase() + name.substring(1,name.length()).toLowerCase();
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

  public void learn(String newTrick) {
    tricks.add(newTrick);
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

  public List<String> getHistory() {
    return history;
  }

  public void setHistory(List<String> history) {
    this.history = history;
  }
}
