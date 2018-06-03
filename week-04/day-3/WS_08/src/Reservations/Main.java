package Reservations;

public class Main {
  public static void main(String[] args) {

    Reservation reservation = new Reservation();

    for (int i = 0; i < 6; i++) {
      System.out.println("Booking# " + reservation.getCodeBooking() + " for " + reservation.getDowBooking());

    }
  }
}