package com.java.workshop.temdata.basic.bean;
import java.time.LocalDate;



    public record Organaization(String name,
    String completeaddress,
    String website,
    String email,
    String contactnumber,
    long registrationnumber,
    LocalDate registrationDate){}
    



