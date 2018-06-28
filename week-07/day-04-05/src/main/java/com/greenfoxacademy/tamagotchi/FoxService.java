package com.greenfoxacademy.tamagotchi;

import com.greenfoxacademy.tamagotchi.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxService {
  ArrayList<Fox> foxes;
  ArrayList<String> foodStore;
  ArrayList<String> drinkStore;
  ArrayList<String> trickStore;

  public FoxService() {
    foxes = new ArrayList<>();

    foodStore = new ArrayList<>();
    foodStore.add("chicken and rice");
    foodStore.add("lamb and grilled vegetables");
    foodStore.add("fruit salad");
    foodStore.add("pizza");
    foodStore.add("exotic stuff");

    drinkStore = new ArrayList<>();
    drinkStore.add("protein shake");
    drinkStore.add("water");
    drinkStore.add("milk with coffee");
    drinkStore.add("turmix");
    drinkStore.add("cider");

    trickStore = new ArrayList<>();
    trickStore.add("does Trump's hair");
    trickStore.add("reads a lot");
    trickStore.add("does java");
    trickStore.add("tries to stop javascript");
    trickStore.add("helps an old person");
    trickStore.add("fights crime");
    trickStore.add("steals a kid's candy");

  }

  public void save(Fox fox) {
    foxes.add(fox);
  }

  public int countFoxes() {
    return foxes.size();
  }

  public void addNewFood(String newFood) {
    foodStore.add(newFood);
  }

  public void addNewDrink(String newDrink) {
    drinkStore.add(newDrink);
  }

  public void addNewTrick(String newTrick) {
    trickStore.add(newTrick);
  }

}
