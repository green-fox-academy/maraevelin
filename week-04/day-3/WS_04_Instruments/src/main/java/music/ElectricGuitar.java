package main.java.music;

public class ElectricGuitar extends StringedInstrument{

  public ElectricGuitar() {
    numberOfString = 5;
    soundEffect = "Twang";
  }

  public ElectricGuitar(int numberOfString) {
    this.numberOfString = numberOfString;
    soundEffect = "Twang";
  }

}