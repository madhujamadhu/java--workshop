package com.java.workshop.temdata.basic.bean.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Studentlistmerge {
    public static void main(String[] args) {
        List<Integer> csRollnos=Arrays.asList(100,101,102,103);
        List<Integer> csaRollnos=Arrays.asList(204,205,206,207);
        List<Integer> allRollnos=Stream.concat(csRollnos.stream(), csaRollnos.stream()).sorted().toList();
        System.out.println(allRollnos);
    }
    
}
