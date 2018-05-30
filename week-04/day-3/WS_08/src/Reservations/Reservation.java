package Reservations;

import java.util.Random;

public class Reservation implements Reserving {
  String[] dow;
  String code;

  public Reservation() {
    dow = new String[] {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
  }

  @Override
  public String getCodeBooking() {
    String returnCharacter = "";
    for (int i = 0; i < 8 ; i++) {
      int randomChar = (int) (Math.random() * code.length());
      returnCharacter += code.charAt(randomChar);
    }
    return returnCharacter;
  }

  @Override
  public String getDowBooking() {

    Random day = new Random();
    return dow[day.nextInt(dow.length)];
  }
}
