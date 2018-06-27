package com.greenfoxacademy.dependency;

import com.greenfoxacademy.dependency.printer.MyColor;
import com.greenfoxacademy.dependency.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorldApplication implements CommandLineRunner {

  @Autowired
  MyColor myColor;

  @Autowired
  Printer printer;

  public static void main(String[] args) {
    SpringApplication.run(HelloBeanWorldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hi");
    myColor.printColor();
  }
}
