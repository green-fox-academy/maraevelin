public class Plant {

  String type;
  String colour;
  double waterStatus;
  double waterTreshold;

  public Plant() {

  }

  public Plant(String colour) {
    waterStatus = 3;
  }


  public void indicateStatus() {
    if (waterStatus <= waterTreshold) {
      System.out.println("The " + colour + type +" needs water");
    } else {
      System.out.println("The " + colour + type +" does not need water");
    }

  }

  public void water(double waterAmount) {
    waterStatus = waterStatus + waterAmount;
  }

}
