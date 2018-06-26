package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TableController {

  List<BankAccount> bankaccounts = new ArrayList<>();

  public TableController() {
    bankaccounts.add(new BankAccount("Simba", 2000, "lion", "Zebra"));
    bankaccounts.add(new BankAccount("Nala", 2000, "lyoness", "Zebra"));
    bankaccounts.add(new BankAccount("Mufasa", 0, "dead", "nothing"));
    bankaccounts.add(new BankAccount("Sarabi", 4000, "widow", "Zebra"));
    bankaccounts.add(new BankAccount("Zuzu", 2000, "birb", "Beans"));
  }

  @GetMapping("/table")
  public String showTable(Model model) {
    model.addAttribute("bankaccounts", bankaccounts);
    return "table";
  }

}