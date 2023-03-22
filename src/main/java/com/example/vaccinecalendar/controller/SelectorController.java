package com.example.vaccinecalendar.controller;

import com.example.vaccinecalendar.utils.ControllerUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class SelectorController {
    private final ControllerUtils controllerUtils;

    @GetMapping("/selector")
    public String getSelector() {
        return "selector";
    }

    @GetMapping("/selector/{id}")
    public String getSelectorWithId(@PathVariable("id") Long id, Model model) {
        return controllerUtils.loadSelectedChild(model,id,"selector");
    }
}
