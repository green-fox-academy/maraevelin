package animals;

public class Mammal extends Animal {
  String furColour;

  public Mammal(String name) {
    this.name = name;
    this.age = 5;
    this.gender = "genderless";
    this.size = "big";
    this.furColour = "marvelous";

  }

  @Override
  protected String breed() {
    return "pushing miniature versions out";
  }

  @Override
  protected String sleep() {
    return "having some wild dreams";
  }

  @Override
  protected String eat() {
    return "eating some cheese";
  }

  protected String growFur() {
    return "growing a new layer of fur";
  }

  protected String beFriendly() {
    return "does a frening";
  }

}
