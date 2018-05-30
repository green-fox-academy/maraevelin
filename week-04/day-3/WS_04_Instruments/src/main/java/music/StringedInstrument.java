package main.java.music;

public class StringedInstrument extends Instrument {
  int numberOfString;
  String soundEffect;

  public StringedInstrument() {

  }

  public StringedInstrument(int numberOfString) {
    this.numberOfString = numberOfString;

  }

  public void sound() {
    System.out.println(
        name + ", a " + numberOfString + "-stringed instrument that goes " + soundEffect);
  }

  @Override
  public void play() {
    sound();
  }

}