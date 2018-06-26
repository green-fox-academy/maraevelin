package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TableController {

  List<BankAccount> bankaccounts;

  public TableController() {
    bankaccounts = new ArrayList<>();
    bankaccounts.add(new BankAccount("Simba", 2000, "lion", "Zebra", "king", true));
    bankaccounts.add(new BankAccount("Nala", 2000, "lyoness", "Zebra", "queen", true));
    bankaccounts.add(new BankAccount("Mufasa", 0, "dead", "nothing", "dead", false));
    bankaccounts.add(new BankAccount("Sarabi", 4000, "widow", "Zebra", "old queen", true));
    bankaccounts.add(new BankAccount("Zuzu", 2000, "birb", "Beans", "advisor", true));
  }

  @GetMapping("/table")
  public String showTable(Model model) {
    model.addAttribute("bankaccounts", bankaccounts);
    model.addAttribute("newBankAccount", new BankAccount());
    return "table";
  }

  @PostMapping("/table")
  public String register(@ModelAttribute BankAccount bankAccount) {
    bankaccounts.add(bankAccount);
    return "redirect:/table";
  }

  @PostMapping("/fundraising")
  public String increaseBalance(@RequestParam("id") int id) {
    BankAccount animal = bankaccounts.get(id);
    if (animal.getSocialStatus().equalsIgnoreCase("King")) {
      animal.setBalance(animal.getBalance() + 100);
    } else {
      animal.setBalance(animal.getBalance() + 10);
    }
    return "redirect:/table";
  }

}