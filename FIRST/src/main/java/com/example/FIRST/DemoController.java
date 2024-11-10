package com.example.FIRST;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @GetMapping ("/greet")
    public String greet(@RequestParam String name){

        return "Hello, " + name;
    }
    @PostMapping ("/farewell")
    public String creatUser(@RequestBody name person ){
        return "GoodBye, " + person.getName();
    }
}
