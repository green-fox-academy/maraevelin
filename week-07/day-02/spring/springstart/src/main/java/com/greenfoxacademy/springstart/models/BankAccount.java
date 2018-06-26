package com.greenfoxacademy.springstart.models;

public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private String currency;
  private String socialStatus;
  private boolean goodBoy;

 public BankAccount() {

  }

  public BankAccount(String name, int balance, String animalType, String currency, String socialStatus, boolean goodBoy) {
   this();
   this.name = name;
   this.balance = balance;
   this.animalType = animalType;
   this.currency = currency;
   this.socialStatus = socialStatus;
   this.goodBoy = goodBoy;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getSocialStatus() {
    return socialStatus;
  }

  public void setSocialStatus(String socialStatus) {
    this.socialStatus = socialStatus;
  }

  public boolean isGoodBoy() {
    return goodBoy;
  }

  public void setGoodBoy(boolean goodBoy) {
    this.goodBoy = goodBoy;
  }
}
