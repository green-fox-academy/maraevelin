package com.greenfoxacademy.tamagotchi.repositories;

import com.greenfoxacademy.tamagotchi.models.Fox;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RepoImpl implements Repo {

  private Map<String, Fox> foxes;

  public RepoImpl() {
    foxes = new HashMap<>();
  }


  @Override
  public void save(String foxName) {
    foxes.put(foxName, new Fox(foxName));
  }

  @Override
  public Fox findFox(String foxName) {
    return foxes.get(foxName);
  }
}
