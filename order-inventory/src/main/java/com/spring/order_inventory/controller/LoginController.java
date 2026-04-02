package com.spring.order_inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/auth/login")
    public String loginPage() {
        return "login"; // your thymeleaf login.html
    }
}