package com.example.hospital;

import jakarta.persistence.*;

@Entity
public class Department {
    @Id @GeneratedValue
    private Long id; //Clave del departamento
    private String name; //Nombre del departamento


    @ManyToOne //Relacion muchos a uno
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;
}
