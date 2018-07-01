package com.greenfoxacademy.tamagotchi.services;

import java.text.SimpleDateFormat;
import java.util.Date;
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
    repo.findFox(foxName).setFood(otherFood);
    repo.findFox(foxName).setDrink(otherDrink);
  }

  @Override
  public List<String> getNewTricks(String foxName) {
    return repo.getListOfLearnableTricks(getFox(foxName).getTricks(), repo.getTricksFromTrickStore());
  }

  @Override
  public void learnNewTrick(String foxName, String newTrick) {
    repo.learnNewTrick(foxName, newTrick);
  }

  @Override
  public void addAction(String foxName, String food, String drink) {
    repo.findFox(foxName).getHistory().add(new SimpleDateFormat("yyyy.MM.dd. HH:mm:ss").format(new Date()) + ": new diet! It was high time for " + repo.findFox(foxName).getNameInLine() + " to try " + food + ". And " + drink + "!");
  }

  @Override
  public void addAction(String foxName, String trick) {
    repo.findFox(foxName).getHistory().add(new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss").format(new Date()) + ": 'NEW YEAR, NEW ME!' - Thought " + repo.findFox(foxName).getNameInLine() + ", and finally learnt the mystical arts of " + trick);
  }


}
