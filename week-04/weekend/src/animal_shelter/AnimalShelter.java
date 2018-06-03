package animal_shelter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
  private int budget;
  private List<Animal> animals;
  private List<String> adopters;
  Animal animal = new Animal();

  public AnimalShelter() {
    this.budget = 50;
    this.animals = new ArrayList<Animal>();
    this.adopters = new ArrayList<String>();
  }

  public int rescue(Animal animal) {
    animals.add(animal);
    return animals.size();
  }

  public int heal() {
    int healedAnimals = 0;
    for (int i = 0; i < animals.size(); i++) {
      if (animals.get(i).isHealthy() == false) {
        if (animals.get(i).getHealCost() < this.budget) {
          animals.get(i).setHealthy(true);
          healedAnimals++;
        } break;
      }
    }
    return healedAnimals;
  }

  public void addAdopter(String adopterName) {
    adopters.add(adopterName);
  }

  public void findNewOwner() {
    List<Animal> adoptables = getAdoptableAnimals();
    try {
      animals.remove(adoptables.get((int) (Math.random() * adoptables.size())));
      adopters.remove(adopters.get((int) (Math.random() * adopters.size())));
    } catch (Exception e) {
      System.out.println("no adoption is possible at the moment");
    }
  }

  private List<Animal> getAdoptableAnimals() {
    List<Animal> adoptables = new ArrayList<>();
    for (Animal animal:
         animals) {
      if (animal.isHealthy() == true) {
        adoptables.add(animal);
      }
    }
    return adoptables;
  }

  public int earnDonation(int donation) {
    setBudget(getBudget() + donation);
    return getBudget();
  }

  public String toString() {
    return "Budget: " + getBudget() + "€, There are " + animals.size() + " and " + adopters.size() + "potential adopter(s)" + getStatus();
  }

  public String getStatus() {
    String shelterStatus = "";
    for (int i = 0; i < animals.size(); i++) {
      shelterStatus = shelterStatus + (animals.get(i).toString());
    }
    return shelterStatus;
  }

  public int getBudget() {
    return budget;
  }

  public void setBudget(int budget) {
    this.budget = budget;
  }

  public List<Animal> getAnimals() {
    return animals;
  }

  public void setAnimals(List<Animal> animals) {
    this.animals = animals;
  }

  public List<String> getAdopters() {
    return adopters;
  }

  public void setAdopters(List<String> adopters) {
    this.adopters = adopters;
  }

}