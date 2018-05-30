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
  public String sleep() {
    return "has no time for you";
  }

  @Override
  public String eat() {
    return "eating some dank worms";
  }

  public String fly() {
    return "had enough of you";
  }

  public String beAngry() {
    return "does an angery react";
  }

}