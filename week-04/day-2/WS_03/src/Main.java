public class Main {
  public static void main(String[] args) {

    Carrier carrier = new Carrier("carrier", 2000, 4000);
    F16 firstF16 = new F16();
    carrier.add(firstF16);
    F16 secondF16 = new F16();
    carrier.add(secondF16);
    F35 firstF35 = new F35();
    carrier.add(firstF35);
    F35 secondF35 = new F35();
    carrier.add(secondF35);

    firstF16.getStatus();
    secondF16.getStatus();
    firstF35.getStatus();
    secondF35.getStatus();

    carrier.getStatus();

  }
}