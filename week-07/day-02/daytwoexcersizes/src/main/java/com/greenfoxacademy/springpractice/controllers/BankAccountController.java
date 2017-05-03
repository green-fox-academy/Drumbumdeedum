package com.greenfoxacademy.springpractice.controllers;

import com.greenfoxacademy.springpractice.model.BankAccount;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  BankAccount newAccount1;
  BankAccount newAccount2;
  BankAccount newAccount3;
  ArrayList<BankAccount> accounts = new ArrayList<>();

  @RequestMapping("/Excersize1")
  public String initializeBankAccount(Model model) {
    newAccount1 = new BankAccount("Simba", "lion", "2000");
    newAccount2 = new BankAccount("Scar", "lion", "1000");
    newAccount3 = new BankAccount("Bagheera", "panther", "1800");
    accounts.add(newAccount1);
    accounts.add(newAccount2);
    accounts.add(newAccount3);
    model.addAttribute("accounts", accounts);
    return "showBankAccount";
  }
}
