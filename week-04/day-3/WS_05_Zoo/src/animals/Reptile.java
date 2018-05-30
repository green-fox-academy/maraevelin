package animals;

public class Reptile extends Animal implements  EggLaying{
  String scaleColour;

  public Reptile(String name) {
    this.name = name;
    this.age = 10;
    this.gender = "noGender";
    this.size = "small";
    this.scaleColour = "shiny";

  }

  @Override
  public String sleep() {
    return "the acid kicked in";
  }

  @Override
  public String eat() {
    return "is having some high-life dinner";
  }

  public String chill() {
    return "is as cool as you will never be";
  }

  public String shedSkin() {
    return "got tired of its skin";
  }

}