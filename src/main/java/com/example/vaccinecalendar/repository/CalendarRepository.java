package com.example.vaccinecalendar.repository;

import com.example.vaccinecalendar.model.ChildModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarRepository extends JpaRepository<ChildModel, Long> {
}
