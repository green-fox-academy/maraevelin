public class Flower extends Plant {

  public Flower(String type, String colour, double waterStatus, double waterTreshold) {
    type = "Flower";
    waterTreshold = 5;
  }

  public Flower(String colour) {

  }

  @Override
  public void water(double waterAmount) {
    waterStatus = waterStatus + waterAmount * 0.7;
  }

}