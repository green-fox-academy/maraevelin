package com.greenfoxacademy.tamagotchi.models.creatures;

public class Seagal extends Creature {

  public Seagal() {

  }

  public static void main(String[] args) {
    Seagal seagal = new Seagal();
    seagal.setName("szegi");

    System.out.println(seagal.getType());
  }

}
