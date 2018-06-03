package animal_shelter;

public class Parrot extends Animal {
  public Parrot() {
    setHealCost((int) (4 + Math.random() * 10));
  }

  public Parrot(String name) {
    setName(name);
    setHealCost((int) (4 + Math.random() * 10));
  }
}