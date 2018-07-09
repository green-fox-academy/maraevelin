package com.greenfoxacademy.frontend.moduls;

import java.util.List;

public class ArrayHandlerResult {
  private int result;

  public ArrayHandlerResult(ArrayHandler arrayHandler) {
    if (arrayHandler.getWhat().equals("sum")) {
      result = getSum(arrayHandler.getNumbers());
    } else if (arrayHandler.getWhat().equals("multiply")) {
      result = getMultiplication(arrayHandler.getNumbers());
    }
  }

  private int getSum(List<Integer> numbers) {
    for (int i = 0; i < numbers.size(); i++) {
      result += numbers.get(i);
    }
    return result;
  }

  private int getMultiplication(List<Integer> numbers) {
    result = 1;
    for (int i = 0; i < numbers.size(); i++) {
      result *= numbers.get(i);
    }
    return result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
