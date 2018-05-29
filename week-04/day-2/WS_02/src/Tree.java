public class Tree extends Plant {

  public Tree(String type, String colour, double status, double treshold) {
    super(type, colour, status, treshold);
    setType("Tree");
    setColour("");
    setTreshold(10);
  }

  public Tree(String colour) {
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
