package com.example.vaccinecalendar.controller;

import com.example.vaccinecalendar.model.ChildModel;
import com.example.vaccinecalendar.service.ChildService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final ChildService childService;
    @GetMapping("/")
    public RedirectView getHome() {
        return new RedirectView("/0");
    }

    @GetMapping("/{id}")
    public String getHome(@PathVariable("id") Long id,Model model){
        ChildModel child = childService.getChildById(id);
        model.addAttribute("child",child);
        return "index";
    }


    @GetMapping("/about/{id}")
    public String getAbout(@PathVariable("id") Long id,Model model) {
        ChildModel child = childService.getChildById(id);
        model.addAttribute("child",child);
        return "about";
    }
}
