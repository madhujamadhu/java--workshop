package com.java.workshop.collection.basic.bean.stream;

import java.util.ArrayList;
import java.util.List;

public class Stearmuppercasenames {
     public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("madhu");
        names.add("shahana");
        names.add("kobi");
        names.add("ajee");
        names.add("vinu");
        names.stream().filter(name->name.startsWith("s")||name.startsWith("S")).distinct().map(String::toUpperCase)
        .forEach(System.out::println);
    }
    
}
