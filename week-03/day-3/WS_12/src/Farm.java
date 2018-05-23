import java.util.ArrayList;
import java.util.List;

public class Farm {
  int limit = 3;
  List<Animal> animalList;

  public Farm() {
    this.animalList = new ArrayList<Animal>();
  }

    public void breed() {
      if (limit > 0) {
        animalList.add(new Animal());
      }
    }

    public void slaughter() {
      Animal fatty = animalList.get(0);
      for (int i = 0; i < animalList.size(); i++) {
        if (animalList.get(i).hunger > fatty.hunger) {
          fatty = animalList.get(i);
        }
      }
      animalList.remove(fatty);
    }

  public static void main(String[] args) {
    Farm farm = new Farm();
    List<Animal> animalList = new ArrayList<Animal>();

    Animal animal1 = new Animal();
    animal1.eat();
    animal1.drink();
    Animal animal2 = new Animal();
    animal2.play();
    Animal animal3 = new Animal();
    animal3.play();
    Animal animal4 = new Animal();
    animal4.drink();
    animal4.eat();
    animal4.eat();
    Animal animal5 = new Animal();
    animal5.play();

    animalList.add(animal1);
    animalList.add(animal2);
    animalList.add(animal3);
    animalList.add(animal4);
    animalList.add(animal5);

    farm.animalList = animalList;
    System.out.println(animalList.size());


    farm.slaughter();
    System.out.println(animalList.size());

    farm.breed();
    System.out.println(animalList.size());

  }

}
