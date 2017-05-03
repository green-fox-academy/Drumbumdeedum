package com.greenfoxacademy.springpractice.controllers;

import com.greenfoxacademy.springpractice.model.BankAccount;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  BankAccount newAccount1;
  ArrayList<BankAccount> accounts = new ArrayList<>();

  @RequestMapping("/Excersize1")
  public String initializeBankAccount(Model model) {
    newAccount1 = new BankAccount("Simba", "lion", "2000", false, false);
    accounts.add(newAccount1);
    model.addAttribute("accounts", accounts);
    return "showBankAccount";
  }
}
