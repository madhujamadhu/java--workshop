package com.java.workshop.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Markss {
    public static void main(String[] args) {
        List<Integer> marks=new ArrayList<>();
        marks.add(98);
        marks.add(87);
        marks.add(45);
        marks.add(78);
        System.out.println("marks"+marks);
        marks.sort(Comparator.naturalOrder());
        System.out.println("sortmarks"+marks);
        marks.sort(Comparator.reverseOrder());
        System.out.println("reverse marks"+marks);
        System.out.println("hight marks:"+marks.get(0));

    }
    
}
