package com.greenfoxacademy.springpractice.controllers;

import com.greenfoxacademy.springpractice.model.BankAccount;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultipleBankAccountsController {

  ArrayList<BankAccount> accounts;


  @RequestMapping("/Excersise5")
  public String initializeBankAccount(Model model) {
    accounts = new ArrayList<>();
    accounts.add(new BankAccount("Simba", "lion", 2000, false, false));
    accounts.add(new BankAccount("Scar", "lion", 1000,false, true));
    accounts.add(new BankAccount("Mufasa", "lion", 2400, true, false));
    accounts.add(new BankAccount("Rafiki", "mandrill", 1,false, false));
    accounts.add(new BankAccount("Pumba", "warthog", 0,false, false));
    accounts.add(new BankAccount("Timon", "meerkat", 0,false, false));
    model.addAttribute("accounts", accounts);
    return "showBankAccount";
  }

  @RequestMapping("/addZebras")
  public String addZebras(@RequestParam(value = "index") String index) {
    accounts.get(Integer.parseInt(index)).setBalance();
    return "redirect:/Excersise5";
  }
}
