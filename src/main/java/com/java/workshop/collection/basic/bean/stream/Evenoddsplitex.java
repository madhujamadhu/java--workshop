package com.java.workshop.collection.basic.bean.stream;

import java.util.Map;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class Evenoddsplitex {
    public static void main(String[] args) {
        List<Integer>numbers=Arrays.asList(10,39,40,10,87,94,30);
        Map<Boolean,List<Integer>>groupedMap=numbers.stream().collect(Collectors.partitioningBy(no->no%2==0));
        System.out.println("Even number:"+groupedMap.get(true));
        System.out.println("Odd number:"+groupedMap.get(false));
    }
    
}
