public class Main {
  public static void main(String[] args) {

    Helicopter helicopter = new Helicopter("blue", 300, 1300);
    Bird bird = new Bird("Parrot");

    System.out.println("How do you take off?");
    helicopter.takeOff();
    bird.takeOff();
    System.out.println("How do you fly?");
    helicopter.fly();
    bird.fly();
    System.out.println("How do you land?");
    helicopter.land();
    bird.land();
  }
}
