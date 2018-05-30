package main.java.music;

public class BassGuitar extends StringedInstrument{

  public BassGuitar() {
    numberOfString = 4;
    soundEffect = "Duum-duum-duum";
  }

  public BassGuitar(int numberOfString) {
    this.numberOfString = numberOfString;
    soundEffect = "Duum-duum-duum";
  }

}