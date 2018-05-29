public class Tree extends Plant {

  public Tree(String type, String colour, double status, double treshold) {
    super(type, colour, status, treshold);
    setType("Tree");
    setColour("");
    setTreshold(10);
  }

  public Tree(String colour) {
    setType("Tree");
    setColour(colour);
    setTreshold(10);
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
