package com.example.vaccinecalendar.repository;

import com.example.vaccinecalendar.model.ChildModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<ChildModel, Long> {
}
