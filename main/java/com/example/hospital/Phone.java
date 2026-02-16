package com.example.hospital;

import jakarta.persistence.Embeddable;

@Embeddable
public class Phone {
    private String countryCode;
    private String number;
}
