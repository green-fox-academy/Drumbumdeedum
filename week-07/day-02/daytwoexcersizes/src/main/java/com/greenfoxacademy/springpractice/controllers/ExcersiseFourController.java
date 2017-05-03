package com.greenfoxacademy.springpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExcersiseFourController {

  @RequestMapping("/Excersize4")
  public String print(Model model) {
    String test = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("test", test);
    return "excersiseFour";
  }
}
