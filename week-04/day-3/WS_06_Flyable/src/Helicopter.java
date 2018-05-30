public class Helicopter extends Vehicle implements  Flyable{
  public Helicopter(String colour, int maxSpeed, int kmDone) {
    this.colour = colour;
    this.maxSpeed = maxSpeed;
    this.kmDone = kmDone;
  }

  @Override
  public void land() {
    System.out.println(getClass().getSimpleName() + " is landing");
  }

  @Override
  public void fly() {
    System.out.println(getClass().getSimpleName() + " is flying");
  }

  @Override
  public void takeOff() {
    System.out.println(getClass().getSimpleName() + " is taking off");
  }

}
