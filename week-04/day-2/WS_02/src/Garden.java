import java.util.ArrayList;

public class Garden {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Plant> getPlants() {
    return plants;
  }

  public void setPlants(ArrayList<Plant> plants) {
    this.plants = plants;
  }

  private ArrayList<Plant> plants;

  public Garden(String name) {
    this.name = name;
    plants = new ArrayList<>();
  }

  public void addPlants(Plant plant) {
    plants.add(plant);
  }

  public void waterGarden(double waterAmount) {
    double waterAmountPerPlant = getIndividualAmount(waterAmount);
    System.out.println("Watering with " + waterAmount);
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).getType().equals("Flower")) {
        if (plants.get(i).getStatus() <= plants.get(i).getTreshold()) {
          plants.get(i).setStatus(plants.get(i).getStatus() + waterAmountPerPlant * 0.75);
        }
      } else {
        if (plants.get(i).getStatus() <= plants.get(i).getTreshold()) {
          plants.get(i).setStatus(plants.get(i).getStatus() + waterAmountPerPlant * 0.4);
        }
      }
    }
  }

  public double getIndividualAmount(double waterAmount) {
    return waterAmount / plants.size();
  }

}
