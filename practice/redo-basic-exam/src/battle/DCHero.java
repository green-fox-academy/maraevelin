package battle;

public class DCHero extends Hero{

  DCHero(String name) {
    super(name, 45);
  }

  DCHero(String name, int motivation) {
    super(name, motivation);
  }

  @Override
  public void punch(Punchable other) {
    if (other instanceof DCHero) {
      System.out.println("no, my mom's martha");
    } else if (other instanceof Punchable)
      super.punch(other);
  }
}
