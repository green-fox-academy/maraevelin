public class Flower extends Plant {

  public Flower(String type, String colour, double status, double treshold) {
    super(type, colour, status, treshold);
    setType("Flower");
    setColour("");
    setTreshold(5);
  }

  public Flower(String colour) {
    setType("Flower");
    setColour(colour);
    setTreshold(5);
  }

  @Override
  public void showGarden() {
    if (getStatus() <= getTreshold()) {
      System.out.println("The " + getColour() + " " + getType() + " needs water" );
    } else {
      System.out.println("The " + getColour() + " " + getType() + " does not need water" );
    }
  }

}
