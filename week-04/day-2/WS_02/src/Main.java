import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

//    ArrayList<Plant> gardenPlants = new ArrayList<>();
    Garden gardenPlants = new Garden("gardenPlants");

    Flower flower1 = new Flower("yellow");
    gardenPlants.addPlants(flower1);
    Flower flower2 = new Flower("blue");
    gardenPlants.addPlants(flower2);
    Tree tree1 = new Tree("orange");
    gardenPlants.addPlants(tree1);
    Tree tree2 = new Tree("purple");
    gardenPlants.addPlants(tree2);

    introduceGarden(gardenPlants);

    gardenPlants.waterGarden(40);

    introduceGarden(gardenPlants);

    gardenPlants.waterGarden(70);

    introduceGarden(gardenPlants);

  }

  public static void introduceGarden(Garden gardenPlants) {
    for (Plant plant :
        gardenPlants.getPlants()) {
      plant.showGarden();
    }
  }
}
