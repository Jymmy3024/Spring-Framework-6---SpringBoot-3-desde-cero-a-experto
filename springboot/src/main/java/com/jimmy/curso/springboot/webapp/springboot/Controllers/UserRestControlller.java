package com.jimmy.curso.springboot.webapp.springboot.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jimmy.curso.springboot.webapp.springboot.Model.User;
import com.jimmy.curso.springboot.webapp.springboot.Model.Dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestControlller {

    @GetMapping("details")
    public UserDto details(){
        User user = new User("Jimmy","Chaverra");
        UserDto userDto = new UserDto();
        userDto.setTitle("Detalle");
        userDto.setUser(user);
        return userDto;
    }

    @GetMapping("details-map")
    public Map<String, Object> detailsMap(){
        User user = new User("Jimmy","Chaverra");
        Map<String,Object> json = new HashMap<>();
        json.put("title", "Detalle");
        json.put("user", user);
        return json;
    }
}
