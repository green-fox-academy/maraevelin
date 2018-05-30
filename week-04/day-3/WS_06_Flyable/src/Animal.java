public class Animal {
  protected String name;
  protected String gender;
  protected String size;
  protected int age;

  public Animal() {

  }

  public String getName() {
    return name;
  }

  public String sleep () {
    return "";
  }

  public String eat () {
    return "";
  }

  public String breed() {
    if (Animal.this instanceof EggLaying) {
      return "laying eggs";
    } else {
      return "";
    }
  }
}