package com.java.workshop.collections;
import java.util.Set;
import java.util.HashSet;

public class Studentset {
    public static void main(String[] args) {
        Set<Integer>studentIds=new HashSet<>();
        studentIds.add(101);
        studentIds.add(102);
        studentIds.add(103);
        studentIds.add(101);
        System.out.println("Student IDs:"+studentIds);


    }
    
}
