package main.java.music;

public class Violin extends StringedInstrument{

  public Violin() {
    numberOfString = 4;
    soundEffect = "Screech";
  }

  public Violin(int numberOfString) {
    this.numberOfString = numberOfString;
    soundEffect = "Screech";
  }

}