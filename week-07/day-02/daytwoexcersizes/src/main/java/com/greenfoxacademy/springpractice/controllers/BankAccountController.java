package com.greenfoxacademy.springpractice.controllers;

import com.greenfoxacademy.springpractice.model.BankAccount;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  BankAccount newAccount;
  ArrayList<BankAccount> accounts = new ArrayList<>();

  @RequestMapping("/Excersize1")
  public String initializeBankAccount(Model model) {
    newAccount = new BankAccount("Simba", "lion", "2000");
    accounts.add(newAccount);
    model.addAttribute("accounts", accounts);
    return "showFields";
  }
}
