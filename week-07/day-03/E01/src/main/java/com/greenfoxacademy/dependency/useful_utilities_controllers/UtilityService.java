package com.greenfoxacademy.dependency.useful_utilities_controllers;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("peachpuff");
    colors.add("fuchsia");
    colors.add("chartreuse");
    colors.add("olivedrab");
    colors.add("blanchedalmond");
    colors.add("gainsboro");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }
}
