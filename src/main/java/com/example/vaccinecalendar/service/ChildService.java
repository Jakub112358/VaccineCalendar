package com.example.vaccinecalendar.service;

import com.example.vaccinecalendar.model.ChildModel;
import com.example.vaccinecalendar.repository.ChildRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChildService {
    private final ChildRepository childRepository;

    public void addChild(ChildModel child){
        try{
            childRepository.save(child);
        }catch (Exception e){
            //TODO: handle this exception
            e.printStackTrace();
        }
    }

    public List<ChildModel> getChildList(){
        return childRepository.findAll();
    }
    public Optional<ChildModel> getChildById(Long id){
        return childRepository.findById(id);
    }


}
