package com.java.workshop.basic.bean;
import java.util.Scanner;

public class Nameage {
        public static void main(String[] args) {
    Scanner na=new Scanner(System.in);
    String name=na.nextLine();
    int age=na.nextInt();
    String address=na.next();
    System.out.println("name:"+name);
    System.out.println("age:"+age);
    System.out.println("adrress:"+address);
    }   
    
}
