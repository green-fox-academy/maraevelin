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
    colors.add("PEACHPUFF");
    colors.add("FUCHSIA");
    colors.add("CHARTREUSE");
    colors.add("OLIVEDRAB");
    colors.add("BLANCHEDALMOND");
    colors.add("GAINSBORO");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }
}
