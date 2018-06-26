 package com.greenfoxacademy.springstart.controllers;

 import org.springframework.stereotype.Controller;

 @Controller
public class Translation {

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  public String translation() {
    int randomTranslation = (int) (1 + (Math.random() * (hellos.length)));
    return hellos[randomTranslation];
  }

  public int rgbR() {
    return ((int) (Math.random() * 256));
  }

   public int rgbG() {
     return ((int) (Math.random() * 256));
   }

   public int rgbB() {
     return ((int) (Math.random() * 256));
   }

  public int fontSize() {
    return (int) (10 + (Math.random() * 72));
  }


}