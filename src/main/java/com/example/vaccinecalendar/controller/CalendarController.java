package com.example.vaccinecalendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalendarController {
    @GetMapping("/new")
    public String getNewCalendar(){
        return "newCalendar";
    }

    @GetMapping("/load")
    public String getLoadCalendar(){
        return "loadCalendar";
    }

    @GetMapping("/calendar")
    public String getCalendar(){
        return "calendar";
    }
}
