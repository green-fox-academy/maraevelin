package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SingleBankAccount {

  private List<BankAccount> bankaccounts = new ArrayList<>();

  @GetMapping("/show")
  public String showBankAccountPage(Model model) {
    model.addAttribute("bankaccount", new BankAccount("Simba", 2000, "lion", "Zebra", "king", true));
    return "show";
  }

}
