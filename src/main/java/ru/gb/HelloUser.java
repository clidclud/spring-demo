package ru.gb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloUser {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Привет, пользователь!");
        return "index";
    }
}
