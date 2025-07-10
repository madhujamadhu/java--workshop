package com.java.workshop.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ListExample {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("madhu");
        names.add("shahana");
        names.add("kobi");
        names.add("ajee");
        names.add("vinu");
        System.out.println(names);
        names.set(1, "shaha");
        for(int i=0;i<names.size();i++){
            System.out.println("name:"+names.get(i));
        }
        names.sort(Comparator.naturalOrder());
        System.out.println("sorted names:"+names);
        names.sort(Comparator.reverseOrder());
        System.out.println("Reverse sorted names:"+names);
    }
}
