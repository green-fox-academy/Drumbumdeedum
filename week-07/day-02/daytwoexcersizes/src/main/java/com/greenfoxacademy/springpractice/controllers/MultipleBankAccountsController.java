package com.greenfoxacademy.springpractice.controllers;

import com.greenfoxacademy.springpractice.model.BankAccount;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MultipleBankAccountsController {

  ArrayList<BankAccount> accounts = new ArrayList<>();


  @RequestMapping("/Excersise5")
  public String initializeBankAccount(Model model) {
    accounts.add(new BankAccount("Simba", "lion", 2000, false, false));
    accounts.add(new BankAccount("Scar", "lion", 1400, false, true));
    accounts.add(new BankAccount("Mufasa", "lion", 2400, true, false));
    accounts.add(new BankAccount("Rafiki", "mandrill", 1, false, false));
    accounts.add(new BankAccount("Pumba", "warthog", 0, false, false));
    accounts.add(new BankAccount("Timon", "meerkat", 0, false, false));
    model.addAttribute("accounts", accounts);
    return "showBankAccount";
  }

  @RequestMapping("/addZebras")
  public String addZebras(int index) {
    System.out.println(index);
    accounts.get(index).setBalance();
    System.out.println(accounts.get(index).getBalance());
    return "redirect:/Excersise5";
  }
}
