package com.example.hospital;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String street; // Direccion
    private String city;   //Ciudad
    private String state;  //Provincia
    private String zip;    //Cod postal
}
