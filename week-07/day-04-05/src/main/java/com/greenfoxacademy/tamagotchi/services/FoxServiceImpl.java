package com.greenfoxacademy.tamagotchi.services;

import com.greenfoxacademy.tamagotchi.models.Fox;
import com.greenfoxacademy.tamagotchi.repositories.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoxServiceImpl implements FoxService{

  @Autowired
  Repo repo;

  @Override
  public void login(String foxName) {
    if (repo.findFox(foxName) == null) {
      repo.save(foxName);
    }
  }

  @Override
  public Fox getFox(String foxName) {
    return repo.findFox(foxName);
  }

  @Override
  public int countKnownTricks(String foxName) {
    return repo.findFox(foxName).knownTricks();
  }

  @Override
  public List<String> getFoodStore() {
    return repo.getFoodFromFoodStore();
  }

  @Override
  public List<String> getDrinkStore() {
    return repo.getDrinksFromDrinkStore();
  }

  @Override
  public void changeDiet(String foxName, String otherFood, String otherDrink) {
    getFox(foxName).setFood(otherFood);
    getFox(foxName).setDrink(otherDrink);
  }

  @Override
  public List<String> getNewTricks(String foxName) {
    return repo.getListOfLearnableTricks(getFox(foxName).getTricks(), repo.getTricksFromTrickStore());
  }

  @Override
  public void learnNewTrick(String foxName, String newTrick) {
    repo.learnNewTrick(foxName, newTrick);
  }


}
