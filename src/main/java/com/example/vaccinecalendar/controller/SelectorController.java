package com.example.vaccinecalendar.controller;

import com.example.vaccinecalendar.model.ChildModel;
import com.example.vaccinecalendar.service.ChildService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class SelectorController {
    private final ChildService childService;
    @GetMapping("/selector")
    public String getSelector(){
        return "selector";
    }

    @GetMapping("/selector/{id}")
    public String getSelectorWithId(@PathVariable("id") Long id, Model model){
        ChildModel child = childService.getChildById(id);
        model.addAttribute("child", child);
        return "selector";
    }
}
