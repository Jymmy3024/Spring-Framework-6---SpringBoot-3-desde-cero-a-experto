package com.jimmy.curso.springboot.webapp.springboot.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestControlller {

    @GetMapping("details")
    public Map<String, Object> details(){
        Map<String,Object> json = new HashMap<>();
        json.put("title", "Detalle");
        json.put("name", "Jimmy");
        json.put("lastname", "Chaverra");
        return json;
    }
}
