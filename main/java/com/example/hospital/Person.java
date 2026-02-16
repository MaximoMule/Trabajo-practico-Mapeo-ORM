package com.example.hospital;

import jakarta.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
public abstract class Person {
    private String title;  //Titulo de la persona
    private String firstName; //Nombre
    private String lastName;  //Apellido
    private LocalDate birthDate; //Fecha de nacimiento
    private String gender; //Genero

    @Embedded
    private Address homeAddress;  //Direccion de la casa
    private String phone;   //Num
}
