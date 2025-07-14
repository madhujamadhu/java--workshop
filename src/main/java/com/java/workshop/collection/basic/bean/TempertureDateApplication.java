package com.java.workshop.collection.basic.bean;

import java.time.LocalDate;

public class TempertureDateApplication {
    public static void main(String[] args) {
        Organaization vet=new Organaization("vetias",
                                            "Thindal",
                                            "www.vetias.com",
                                            "vetias@ac.in",
                                            "9842840033",
                                            123456789L,
                                            LocalDate.of(2020,1,1));
    System.out.println(vet.name());
    System.out.println(vet.completeaddress());
    System.out.println(vet.website());
    System.out.println(vet.email());
    System.out.println(vet.contactnumber());
    System.out.println(vet.registrationnumber());
    System.out.println(vet.registrationDate());
    }
    
}
