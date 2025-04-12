package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Add any necessary model attributes here
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        // Add any necessary model attributes here
        return "about";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        // Add any necessary model attributes here
        return "projects";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        // Add any necessary model attributes here
        return "contact";
    }
}