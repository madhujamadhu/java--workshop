package com.java.workshop.basic.bean.strings;

public class Wordcount {
public int count(String inputString)
{
    int count=0;
    String[] words = inputString.split(" ");
    count=words.length;
    return count;
}
    
}
