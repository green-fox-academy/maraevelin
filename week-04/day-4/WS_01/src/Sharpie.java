public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie () {

  }

  public Sharpie (String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public float use() {
    return inkAmount -= 5;
  }

}