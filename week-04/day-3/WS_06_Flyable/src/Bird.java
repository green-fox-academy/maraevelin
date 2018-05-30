public class Bird extends Animal implements EggLaying, Flyable{
  String featherColour;

  public Bird(String name) {
    this.name = name;
    this.age = 2;
    this.gender = "trueBoi";
    this.size = "teeny";
    this.featherColour = "dark";

  }

  @Override
  public void land() {
    System.out.println(getClass().getSimpleName() + " is landing");
  }

  @Override
  public void fly() {
    System.out.println(getClass().getSimpleName() + " is flying");
  }

  @Override
  public void takeOff() {
    System.out.println(getClass().getSimpleName() + " is takingOff");
  }

  @Override
  public String sleep() {
    return " has no time for you";
  }

  @Override
  public String eat() {
    return " eating some dank worms";
  }

  public String beAngry() {
    return " does an angery react";
  }

}