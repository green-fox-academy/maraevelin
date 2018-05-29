public class Tree extends Plant {

  public Tree(String type, String colour, double waterStatus, double waterTreshold) {
    type = "Tree";
    waterTreshold = 10;
  }

  public Tree(String colour) {

  }

  @Override
  public void water(double waterAmount) {
    waterStatus = waterStatus + waterAmount * 0.4;
  }

}