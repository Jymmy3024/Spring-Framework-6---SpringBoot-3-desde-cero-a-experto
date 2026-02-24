package com.jimmy.curso.springboot.webapp.springboot.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jimmy.curso.springboot.webapp.springboot.Model.User;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Jimmy","Chaverra");
        model.addAttribute("title", "Details");
        model.addAttribute("user", user);
        return "details";
    }
}
