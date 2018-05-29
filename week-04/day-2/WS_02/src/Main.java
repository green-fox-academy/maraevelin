import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Plant> gardenPlants = new ArrayList<>();

    Flower flower1 = new Flower("yellow");
    gardenPlants.add(flower1);
    Flower flower2 = new Flower("blue");
    gardenPlants.add(flower2);
    Tree tree1 = new Tree("orange");
    gardenPlants.add(tree1);
    Tree tree2 = new Tree("purple");
    gardenPlants.add(tree2);

    for (Plant plant :
         gardenPlants) {
      plant.showGarden();
    }

  }
}
