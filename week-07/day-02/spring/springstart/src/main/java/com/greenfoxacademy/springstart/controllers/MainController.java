//package com.greenfoxacademy.springstart.controllers;
//
//import com.greenfoxacademy.springstart.models.BankAccount;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//public class MainController {
//
//  private List<BankAccount> bankaccounts = new ArrayList<>();
//
//  @GetMapping("/show")
//  public String showBankAccountPage(Model model) {
//    model.addAttribute("bankaccount", new BankAccount("Simba", 2000, "lion", "Zebra"));
//    return "show";
//  }
//
//  @GetMapping("/htmltext")
//  public String showHTMLText(Model model) {
//    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
//    return "htmltext";
//  }
//
//  @GetMapping("/table")
//  public String showTable(Model model) {
//    bankaccounts.add(new BankAccount("Simba", 2000, "lion", "Zebra"));
//    bankaccounts.add(new BankAccount("Nala", 2000, "lyoness", "Zebra"));
//    bankaccounts.add(new BankAccount("Mufasa", 0, "dead", "nothing"));
//    bankaccounts.add(new BankAccount("Sarabi", 4000, "widow", "Zebra"));
//    bankaccounts.add(new BankAccount("Zuzu", 2000, "birb", "Beans"));
//    model.addAttribute("bankaccounts", bankaccounts);
//    return "table";
//  }
//
//}