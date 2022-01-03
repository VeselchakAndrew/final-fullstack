package com.example.springtest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @GetMapping("/")
  public void getController() {
    System.out.println("Test");
  }
}
