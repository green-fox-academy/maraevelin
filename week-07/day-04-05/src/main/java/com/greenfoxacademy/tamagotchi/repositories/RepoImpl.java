package com.greenfoxacademy.tamagotchi.repositories;

import com.greenfoxacademy.tamagotchi.models.Fox;
import com.greenfoxacademy.tamagotchi.models.stores.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class RepoImpl implements Repo {

  private Map<String, Fox> foxes;
  private List<String> drinks;
  private List<String> foods;
  private List<String> trickset;

  public RepoImpl() {
    foxes = new HashMap<>();
    drinks = new DrinkStore().getDrinkStore();
    foods = new FoodStore().getFoodStore();
    trickset = new TrickStore().getTrickStore();

  }

  @Override
  public void save(String foxName) {
    foxes.put(foxName, new Fox(foxName));
    foxes.get(foxName).setFood(foods.get(0));
    foxes.get(foxName).setDrink(drinks.get(0));
    }

  @Override
  public Fox findFox(String foxName) {
    return foxes.get(foxName);
  }

  @Override
  public List<String> getDrinksFromDrinkStore() {
    return drinks;
  }

  @Override
  public List<String> getFoodFromFoodStore() {
    return foods;
  }

  @Override
  public List<String> getTricksFromTrickStore() {
    return trickset;
  }

  @Override
  public void addNewDrink(String newDrink) {
    drinks.add(newDrink);
  }

  @Override
  public void addNewFood(String newFood) {
    foods.add(newFood);
  }

  @Override
  public void addNewTrick(String newTrick) {
    trickset.add(newTrick);
  }


}
