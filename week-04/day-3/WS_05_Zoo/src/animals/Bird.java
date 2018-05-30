package animals;

public class Bird extends Animal implements EggLaying{
  String featherColour;

  public Bird(String name) {
    this.name = name;
    this.age = 2;
    this.gender = "trueBoi";
    this.size = "teeny";
    this.featherColour = "dark";

  }

  @Override
  protected String sleep() {
    return "has no time for you";
  }

  @Override
  protected String eat() {
    return "eating some dank worms";
  }

  protected String fly() {
    return "had enough of you";
  }

  protected String beAngry() {
    return "does an angery react";
  }

}