import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Plant> gardenPlants = new ArrayList<>();

    Plant flower1 = new Flower("yellow");
    gardenPlants.add(flower1);
    Plant flower2 = new Flower("blue");
    gardenPlants.add(flower2);
    Plant tree1 = new Tree("orange");
    gardenPlants.add(tree1);
    Plant tree2 = new Tree("purple");
    gardenPlants.add(tree2);

    for(Plant plant : gardenPlants) {
      plant.indicateStatus();
    }

    

    for(Plant plant : gardenPlants) {
      plant.indicateStatus();
    }

    gardenPlants.water(70);

    for(Plant plant : gardenPlants) {
      plant.indicateStatus();
    }

  }
}
