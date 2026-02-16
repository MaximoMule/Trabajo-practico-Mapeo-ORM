package com.example.hospital;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Staff extends Person {
    @Id @GeneratedValue
    private Long id;
    private LocalDate joined;

    @ElementCollection
    private List<String> education;

    @ElementCollection
    private List<String> certification;

    @ElementCollection
    private List<String> languages;
}
