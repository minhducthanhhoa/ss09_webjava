package com.data.sesson09_webjava.controller;

import com.data.sesson09_webjava.model.Customer;
import com.data.sesson09_webjava.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @Autowired
    private CustomerService customerService = new CustomerService();

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password,
                               Model model) {
        Customer customer = customerService.login(username, password);
        if (customer != null) {
            model.addAttribute("customer", customer);
            return "home";
        } else {
            model.addAttribute("error", "Sai tài khoản hoặc mật khẩu!");
            return "login";
        }
    }

    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }
}
