package com.greenfoxacademy.controllers;

import com.greenfoxacademy.HelloInLanguage;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloAllWorldController {

  ArrayList<HelloInLanguage> helloList = new ArrayList<>();

  @RequestMapping("/greetWorld")
  public String greetInLanguages(@RequestParam(value = "name", defaultValue = "everyone") String name, Model list) {

    for (String hello : hellos) {
      HelloInLanguage language = new HelloInLanguage(hello + " " + name + "! ", randomFontColor(), randomFontSize());
      helloList.add(language);
    }
    list.addAttribute("helloList", helloList);
    return "greetWorld";
  }

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
    "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
    "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
    "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"
  };

  public String randomFontColor() {
    String letters = "0123456789ABCDEF";
    String color = "#";
    for (int i = 0; i < 6; i++ ) {
      color += letters.charAt((int) (Math.random() * 16));
    }
    return color;
  }

  public String randomFontSize() {
    String firstNumber = "1234";
    String secondNumber = "0123456789";
    String number = "";
    for (int i=0; i < 1; i++) {
      number += firstNumber.charAt((int) (Math.random() * 4));
      number += secondNumber.charAt((int) (Math.random() * 10));
    }
    return number;
  }
}



