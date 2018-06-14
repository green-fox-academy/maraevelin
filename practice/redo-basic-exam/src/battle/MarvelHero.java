package battle;

public class MarvelHero extends Hero{

  MarvelHero(String name) {
    super(name,40);
  }

  MarvelHero(String name, int motivation) {
    super(name, motivation);
  }

  @Override
  public void punch(Punchable other) {
    if (other instanceof MarvelHero) {
      System.out.println("mr stark, i don't want to go");
    } else if (other instanceof Punchable)
      super.punch(other);
  }
}
