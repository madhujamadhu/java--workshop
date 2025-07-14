package com.java.workshop.temdata.basic.bean.stream;
import java.util.Arrays;

import java.util.Comparator;
import java.util.List;

public class Streammarks {
    public static void main(String[] args) {
        List<Integer> marks=Arrays.asList(98,65,89,76,44);
        List<Integer> sortedMarks=marks.stream().sorted().toList();
        System.out.println("sorted marks"+sortedMarks);
        List<Integer> reversdec=marks.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Revers marks:"+reversdec);
        System.out.println("Hight marks:"+reversdec.get(0));

    }
    
}
