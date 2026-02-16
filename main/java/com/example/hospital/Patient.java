package com.example.hospital;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Patient extends Person {
    @Id @GeneratedValue
    private Long id; //Clave del paciente
    private int age; //Edad
    private LocalDate accepted; //Fecha en la que ingreso

    @ElementCollection
    private List<String> prescriptions; //Lista prescripciones

    @ElementCollection
    private List<String> allergies;  //Lista alegrias

    @ElementCollection
    private List<String> specialReqs; //Lista de lo que requiere el paciente
}
