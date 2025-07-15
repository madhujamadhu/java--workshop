package com.java.workshop.temdata.basic.bean;


public class TempertureDateApplication {
    public static void main(String[] args) {
        Organaization vet=new Organaization("vetias",
                                            "Thindal",
                                            "www.vetias.com",
                                            "vetias@ac.in",
                                            "9842840033",
                                            123456789);
    System.out.println(vet.name());
    System.out.println(vet.description());
    System.out.println(vet.website());
    System.out.println(vet.email());
    System.out.println(vet.contact_number());
    System.out.println(vet.registration_number());
    }
    
}
