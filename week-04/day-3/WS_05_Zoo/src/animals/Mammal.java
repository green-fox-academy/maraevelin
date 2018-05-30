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
  public String breed() {
    return "pushing miniature versions out";
  }

  @Override
  public String sleep() {
    return "having some wild dreams";
  }

  @Override
  public String eat() {
    return "eating some cheese";
  }

  public String growFur() {
    return "growing a new layer of fur";
  }

  public String beFriendly() {
    return "does a frening";
  }

}
