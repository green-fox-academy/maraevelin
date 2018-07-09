package com.greenfoxacademy.frontend.moduls;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandlerListResult {
  private List<Integer> result;

  public ArrayHandlerListResult(ArrayHandler arrayHandler) {
    result = getDoubles(arrayHandler);
  }

  private List<Integer> getDoubles(ArrayHandler arrayHandler) {
    List<Integer> result = new ArrayList<>();
    List<Integer> array = arrayHandler.getNumbers();
    for (int i = 0; i < array.size(); i++) {
      result.add(array.get(i) * 2);
    }
    return result;
  }

  public List<Integer> getResult() {
    return result;
  }

  public void setResult(List<Integer> result) {
    this.result = result;
  }
}
