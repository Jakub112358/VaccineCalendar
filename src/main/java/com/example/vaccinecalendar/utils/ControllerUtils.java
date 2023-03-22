package com.example.vaccinecalendar.utils;

import com.example.vaccinecalendar.model.ChildModel;
import com.example.vaccinecalendar.service.ChildService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ControllerUtils {
    private final ChildService childService;
    public  String loadSelectedChild(Model model, Long id, String view){
        Optional<ChildModel> child = childService.getChildById(id);
        model.addAttribute("child", child.orElse(null));
        return view;
    }





}
