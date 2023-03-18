package com.example.vaccinecalendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SelectorController {
    @GetMapping("/selector")
    public String getSelector(){
        return "selector";
    }
}
