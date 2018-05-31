import java.util.ArrayList;

public class Sum {
  public int getSum(ArrayList<Integer> inputList) {
    if (inputList == null) {
      return 0;
    }
    int sum = 0;
    for (int i = 0; i < inputList.size(); i++) {
      sum += inputList.get(i);
    }
    return sum;
  }
}
