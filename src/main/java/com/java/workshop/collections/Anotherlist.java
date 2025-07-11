package com.java.workshop.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Anotherlist {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("madhu");
        names.add("shahana");
        names.add("kobi");
        names.add("ajee");
        names.add("vinu");
        names.forEach(System.out::println);
        names.sort(Comparator.reverseOrder());
        System.out.println(names);
    }
}