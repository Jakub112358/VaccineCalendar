package com.example.vaccinecalendar.controller;

import com.example.vaccinecalendar.model.ChildModel;
import com.example.vaccinecalendar.service.CalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
public class CalendarController {
    private final CalendarService calendarService;

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

    @PostMapping("/new")
    public RedirectView postNewCalendar(ChildModel child){
        calendarService.addChild(child);
        return new RedirectView("/selector");
    }
}
