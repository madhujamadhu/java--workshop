package com.java.workshop.temdata.basic.bean.stream;

import java.util.ArrayList;
import java.util.List;

public class Newstartswithcount {
       public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("madhu");
        names.add("shahana");
        names.add("kobi");
        names.add("ajee");
        names.add("vinu");
        long nameCount=names.stream().filter(name->name.startsWith("s")).count();
        System.out.println(nameCount);
    
    }
    
}
