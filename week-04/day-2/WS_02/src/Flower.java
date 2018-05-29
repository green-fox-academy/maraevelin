public class Flower extends Plant {

  public Flower(String type, String colour, double status, double treshold) {
    super(type, colour, status, treshold);
    setType("Flower");
    setColour("");
    setTreshold(5);
  }

  public Flower(String colour) {
    setColour(colour);
  }

  @Override
  public void showGarden() {
    if (getTreshold() >= getStatus()) {
      System.out.println("The " + getColour() + " " + getType() + " needs water" );
    } else {
      System.out.println("The " + getColour() + " " + getType() + " does not need water" );
    }
  }

}
