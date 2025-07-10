package com.java.workshop.collections;

import java.util.ArrayList;
import java.util.List;
public class ListExample {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("madhu");
        names.add("shahana");
        names.add("kobi");
        System.out.println(names);
        for(int i=0;i<names.size();i++){
            System.out.println("name:"+names.get(i));
        }
    }
}
