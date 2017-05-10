package com.greenfox.w08d03.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExcersizeController {

  @RequestMapping("/")
  public String index(Model model) {
    return "index";
  }
}
