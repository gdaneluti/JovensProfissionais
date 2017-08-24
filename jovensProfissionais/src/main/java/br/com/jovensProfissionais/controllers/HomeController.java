package br.com.jovensProfissionais.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{

   @GetMapping("/")
   public String index()
   {
      return "home/index";
   }
}
