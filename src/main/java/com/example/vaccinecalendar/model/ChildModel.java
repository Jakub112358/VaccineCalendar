package com.example.vaccinecalendar.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
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
    @NotEmpty
    @Column(name = "name")
    private String name;
    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NonNull
    @PastOrPresent
    private LocalDate birthDate;
    @NonNull
    @Column(name="first_vacc_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate firstVaccDate;
    @AssertTrue
    @Column(name = "agreement")
    private boolean agreement;

}

