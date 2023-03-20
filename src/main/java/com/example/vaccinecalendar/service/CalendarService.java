package com.example.vaccinecalendar.service;

import com.example.vaccinecalendar.model.ChildModel;
import com.example.vaccinecalendar.repository.CalendarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalendarService {
    private final CalendarRepository calendarRepository;

    public void addChild(ChildModel child){
        try{
            calendarRepository.save(child);
        }catch (Exception e){
            //TODO: handle this exception
            e.printStackTrace();
        }
    }
}
