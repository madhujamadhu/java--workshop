package com.java.workshop.basic.bean;

public class Muliarrya {
    public static void main(String[] args) {
        String[][] students = {
            {"101", "Alice"},
            {"102", "Bob"},
            {"103", "Charlie"},
            {"104", "Diana"}
        };
        System.out.println("Roll No\tName");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i][0] + "\t" + students[i][1]);
        }
    }
    
}
