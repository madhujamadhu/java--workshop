package com.vetias.java.workshop.basics.string;

import org.junit.jupiter.api.Test;

import com.java.workshop.basic.bean.strings.Wordcount;

import org.junit.jupiter.api.Assertions;


public class Wordcouttest {
    @Test
    public void testwordcount(){
        Wordcount wordcount =new Wordcount();
        int count = wordcount.count("this is a java program to test the word count functionlity in java");
        Assertions.assertEquals(13,count);
    }
    @Test
    public void testAnotherString(){
        Wordcount wordcount=new Wordcount();
        int count =wordcount.count("this is another test string");
        Assertions.assertEquals(5,count);
    }
    
}