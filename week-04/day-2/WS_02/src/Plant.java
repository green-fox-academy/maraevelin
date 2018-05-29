public class Plant {
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public double getStatus() {
    return status;
  }

  public void setStatus(double status) {
    this.status = status;
  }

  public double getTreshold() {
    return treshold;
  }

  public void setTreshold(double treshold) {
    this.treshold = treshold;
  }

  private String type;
  private String colour;
  private double status;
  private double treshold;

  public Plant(String type, String colour, double status, double treshold) {
    this.type = type;
    this.colour = colour;
    this.status = status;
    this.treshold = treshold;
  }

  public Plant() {
    this.type = "plant";
    this.colour = "green";
    this.status = 3;
    this.treshold = 5;
  }

  public void showGarden() {
    System.out.println("I'm a nice garden");
  }

}
