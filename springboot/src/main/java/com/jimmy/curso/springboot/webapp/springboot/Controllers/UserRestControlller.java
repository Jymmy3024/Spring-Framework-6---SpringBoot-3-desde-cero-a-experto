package com.jimmy.curso.springboot.webapp.springboot.Controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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

    @GetMapping("list")
    public List<User> list(){
        User user = new User("Jimmy","Chaverra");
        User user1 = new User("Valery","Pedroza");
        User user2 = new User("Sara","Chaverra");

        List<User> userList = Arrays.asList(user, user1, user2);

        return userList;
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
