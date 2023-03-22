package com.example.vaccinecalendar.controller;

import com.example.vaccinecalendar.model.ChildModel;
import com.example.vaccinecalendar.service.ChildService;
import com.example.vaccinecalendar.utils.ControllerUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequiredArgsConstructor

public class CalendarController {
    private final ChildService childService;
    private final ControllerUtils controllerUtils;

    @GetMapping("/new/{id}")
    public String getNewCalendar(@PathVariable("id") Long id, Model model){
        return controllerUtils.loadSelectedChild(model,id,"newCalendar");
    }

    @GetMapping("/load/{id}")
    public String getLoadCalendar(@PathVariable("id") Long id,Model model){
        List<ChildModel> childList = childService.getChildList();
        model.addAttribute("childList",childList);
        return controllerUtils.loadSelectedChild(model,id,"loadCalendar");
    }

    @GetMapping("/calendar/{id}")
    public String getCalendar(@PathVariable("id") Long id, Model model){
        return controllerUtils.loadSelectedChild(model,id,"calendar");
    }

    @PostMapping("/new")
    public RedirectView postNewCalendar(ChildModel child){
        childService.addChild(child);
        return new RedirectView("/selector/"+child.getId());
    }
}
