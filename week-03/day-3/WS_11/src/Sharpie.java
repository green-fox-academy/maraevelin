public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie (String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public float use() {
    return inkAmount -= 5;
  }

  public static void main(String[] args) {
    Sharpie sharpie = new Sharpie("yellow", 25);
    System.out.println(sharpie.color);
    System.out.println(sharpie.width);
    System.out.println(sharpie.inkAmount);
    sharpie.use();
    System.out.println(sharpie.inkAmount);

  }

}
