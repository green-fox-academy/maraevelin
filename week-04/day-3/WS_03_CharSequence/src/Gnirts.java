public class Gnirts implements CharSequence {
  String stringField;

  public Gnirts(String stringField) {
  this.stringField = stringField;
  }

  @Override
  public char charAt(int index) {
    return stringField.charAt(stringField.length() - 1 - index);
  }

  @Override
  public int length() {
    return stringField.length();
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return stringField.subSequence(start, end);
  }

  @Override
  public String toString() {
    return stringField.toString();
  }
}

