package com.jimmy.curso.springboot.webapp.springboot.Controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @GetMapping("list")
    public String list(Model model){
        List<User> users = Arrays.asList(new User("Jimmy", "Chaverra"),
        new User("Vale","Pedroza","vale@correo.com"),
        new User("Sara", "Chaverra", "schaverra@correo.com"));
        model.addAttribute("users",users);
        model.addAttribute("title","User list");
        return "list";
    }
}
