package animals;

public class Animal {
  protected String name;
  protected String gender;
  protected String size;
  protected int age;

  public Animal() {

  }

  protected String getName() {
    return name;
  }

  protected String sleep () {
    return "";
  }

  protected String eat () {
    return "";
  }

  protected String breed() {
    if (Animal.this instanceof EggLaying) {
      return "laying eggs";
    } else {
      return "";
    }
  }
}