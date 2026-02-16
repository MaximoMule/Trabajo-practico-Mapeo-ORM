package com.example.hospital;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Hospital {
    @Id @GeneratedValue
    private Long id; //CLave
    private String name; //Nombre

    @Embedded
    private Address address; //Direccion

    @Embedded
    private Phone phone;  //Num 

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL)
    private List<Department> departments;
}
