package com.java.workshop.temdata.basic.bean.stream;
import java.util.Arrays;

import java.util.stream.IntStream;

public class Arraystearm {
    public static void main(String[] args) {
        int[] marks={90,79,57,32,42};
        long numberofsubjectspassed=Arrays.stream(marks).filter(mark->mark>40).count();
        System.out.println(numberofsubjectspassed);
    

        IntStream markSteram=Arrays.stream(marks);
        numberofsubjectspassed=markSteram.filter(mark->mark>40).count();
    }
    
}
