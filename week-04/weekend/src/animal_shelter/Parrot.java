package animal_shelter;

public class Parrot extends Animal {
  public Parrot() {
    setHealCost((int) (Math.random() + 4 * 10));
  }

  public Parrot(String name) {
    setName(name);
    setHealCost((int) (Math.random() + 4 * 10));
  }
}