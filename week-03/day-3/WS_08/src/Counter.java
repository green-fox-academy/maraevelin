public class Counter {

  static int defaultFieldValue = 0;

  int fieldValue;

  public Counter() {
    fieldValue = 0;
  }

  public Counter(int fieldValue) {
    this.fieldValue = fieldValue;
    defaultFieldValue = defaultFieldValue + fieldValue;
  }

  public int add(int anInteger) {
    return fieldValue += anInteger;
  }

  public int add() {
    return fieldValue += 1;
  }

  public int get() {
    return fieldValue;
  }

  public int reset() {
    return fieldValue = defaultFieldValue;
  }

  public static void main(String[] args) {
    Counter counter = new Counter();
    System.out.println(counter.add());
    System.out.println(counter.get());
    System.out.println(counter.reset());
    System.out.println("^^counter1");
    System.out.println("ˇˇcounter2");
    Counter counter2 = new Counter(10);
    System.out.println(counter2.add());
    System.out.println(counter2.get());
    System.out.println(counter2.reset());
  }
}
