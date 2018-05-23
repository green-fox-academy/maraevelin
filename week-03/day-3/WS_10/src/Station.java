public class Station {

  int gasAmount;

  public void refill(Car car) {
    gasAmount -= car.capacity;
    car.gasAmount += gasAmount;

  }

  public static void main(String[] args) {
    Station station = new Station();
    station.refill(car);
  }

}
