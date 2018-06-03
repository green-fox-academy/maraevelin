package animal_shelter;

public class Cat extends Animal {
  public Cat() {
    setHealCost((int) (1 + Math.random() * 8));
  }

  public Cat(String name) {
    setName(name);
    setHealCost((int) (1 + Math.random() * 8));
  }
}