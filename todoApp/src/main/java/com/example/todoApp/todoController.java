package com.example.todoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todoController {

    @GetMapping("/")
    public String hi() {
        return "헬로 todoApp";
    }
}
