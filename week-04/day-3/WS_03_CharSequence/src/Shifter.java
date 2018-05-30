public class Shifter implements  CharSequence{
  String stringInput;
  int intInput;

  public Shifter(String stringInput, int intInput) {
    this.stringInput = stringInput;
    this.intInput = intInput;
  }

  @Override
  public char charAt(int index) {
    return stringInput.charAt(index + intInput);
  }

  @Override
  public int length() {
    return stringInput.length();
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return stringInput.subSequence(start, end);
  }

  @Override
  public String toString() {
    return stringInput.toString();
  }
}