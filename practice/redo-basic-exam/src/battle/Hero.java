package battle;

public class Hero extends BaseHero implements Punchable {
  private int motivation;

  Hero(String name, int motivation) {
    super(name);
    this.motivation = motivation;
  }

  @Override
  public int getMotivationLevel() {
    if (motivation < 25) {
      return 0;
    } else if (motivation > 40) {
      return 2;
    }
    return 1;
  }

  @Override
  public void punch(Punchable other) {
    if (getMotivationLevel() >= 1) {
      other.bePunched(motivation / 1.5);
    } else {
      System.out.println("Nay, I don't feel like that");
    }
  }

  @Override
  public void bePunched(double damage) {
    motivation -= (damage / motivation);
  }

  @Override
  public String toString() {
    if (getMotivationLevel() == 0) {
      return getName() + "is not motivated anymore";
    } else if (getMotivationLevel() == 1) {
      return getName() + "is motivated";
    }
    return getName() + "is well motivated";
  }
}