package com.greenfoxacademy.tamagotchi.models.stores;

import java.util.ArrayList;
import java.util.List;

public class TrickStore {
  private List<String> trickStore;

  public TrickStore() {
    this.trickStore = new ArrayList<>();
    trickStore.add("reads a lot");
    trickStore.add("does java");
    trickStore.add("stops javascript");
    trickStore.add("helps an old person");
    trickStore.add("fights crime");
    trickStore.add("steals a kid's candy");
    trickStore.add("helps Roko");
    trickStore.add("does Trump's hair");
    trickStore.add("advocate for jägermeister with kefir");

  }

  public List<String> getTrickStore() {
    return trickStore;
  }

  public void setTrickStore(List<String> trickStore) {
    this.trickStore = trickStore;
  }
}
