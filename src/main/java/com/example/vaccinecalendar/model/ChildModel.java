package com.example.vaccinecalendar.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ChildModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    @NotBlank
    @Column(name = "name")
    private String name;
    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NonNull
    private LocalDate birthDate;
    @NonNull
    @Column(name="first_vacc_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate firstVaccDate;
    @AssertTrue
    @Column(name = "agreement")
    private boolean agreement;

}

