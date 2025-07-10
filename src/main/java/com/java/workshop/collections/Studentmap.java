package com.java.workshop.collections;
import java.util.Map;
import java.util.HashMap;

public class Studentmap {
    public static void main(String[] args) {
        Map<Integer,String>students=new HashMap<>();
        students.put(101,"madhu");
        students.put(102,"ajee");
        students.put(103,"kobi");
        students.put(104,"shahana");
        students.put(105,"vinu");
        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
    }

    
}
