package com.greenfoxacademy.tamagotchi.models.stores;

import java.util.ArrayList;
import java.util.List;

public class TrickStore {
  private List<String> trickStore;

  public TrickStore() {
    this.trickStore = new ArrayList<>();
    trickStore.add("reading a lot");
    trickStore.add("doing java");
    trickStore.add("stopping javascript");
    trickStore.add("helping an old person");
    trickStore.add("fighting crime");
    trickStore.add("stealing a kid's candy");
    trickStore.add("supporting Roko");
    trickStore.add("doing Trump's hair");
    trickStore.add("advocating for jägermeister with kefir");

  }

  public List<String> getTrickStore() {
    return trickStore;
  }

  public void setTrickStore(List<String> trickStore) {
    this.trickStore = trickStore;
  }
}
