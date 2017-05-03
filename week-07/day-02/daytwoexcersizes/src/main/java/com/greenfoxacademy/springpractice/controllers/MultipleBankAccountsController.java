package com.greenfoxacademy.springpractice.controllers;

import com.greenfoxacademy.springpractice.model.BankAccount;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MultipleBankAccountsController {

  BankAccount newAccount1;
  BankAccount newAccount2;
  BankAccount newAccount3;
  BankAccount newAccount4;
  BankAccount newAccount5;
  BankAccount newAccount6;
  ArrayList<BankAccount> accounts = new ArrayList<>();

  @RequestMapping("/Excersize5")
  public String initializeBankAccount(Model model) {
    newAccount1 = new BankAccount("Simba", "lion", "2000", false, false);
    newAccount2 = new BankAccount("Scar", "lion", "1000",false, true);
    newAccount3 = new BankAccount("Mufasa", "lion", "2400", true, false);
    newAccount4 = new BankAccount("Rafiki", "mandrill", "1",false, false);
    newAccount5 = new BankAccount("Pumba", "warthog", "0",false, false);
    newAccount6 = new BankAccount("Timon", "meerkat", "0",false, false);
    accounts.add(newAccount1);
    accounts.add(newAccount2);
    accounts.add(newAccount3);
    accounts.add(newAccount4);
    accounts.add(newAccount5);
    accounts.add(newAccount6);
    model.addAttribute("accounts", accounts);
    return "showBankAccount";
  }
}
