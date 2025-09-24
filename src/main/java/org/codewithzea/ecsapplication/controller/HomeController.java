package org.codewithzea.ecsapplication.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Yaw Frimpong");
        model.addAttribute("lab", "ECS Deployment Lab");
        model.addAttribute("description", "ECS Deployment Lab Description");
        model.addAttribute("desc","This is a simple Spring Boot application deployed on AWS ECS using Fargate.");
        return "index";
    }
}

