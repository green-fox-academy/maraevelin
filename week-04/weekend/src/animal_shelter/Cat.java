package animal_shelter;

public class Cat extends Animal {
  public Cat() {
    setHealCost((int) (Math.random() + 1 * 8));
  }

  public Cat(String name) {
    setName(name);
    setHealCost((int) (Math.random() + 1 * 8));
  }
}