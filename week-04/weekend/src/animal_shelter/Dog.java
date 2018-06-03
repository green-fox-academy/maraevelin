package animal_shelter;

public class Dog extends Animal {
  public Dog() {
    setHealCost((int) (Math.random() * 6));
  }

  public Dog(String name) {
    setName(name);
    setHealCost((int) (Math.random() * 6));
  }

}