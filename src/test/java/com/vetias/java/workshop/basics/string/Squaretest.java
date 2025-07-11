package com.vetias.java.workshop.basics.string;

import org.junit.jupiter.api.Test;

import com.java.workshop.collections.Square;

import org.junit.jupiter.api.Assertions;

public class Squaretest {
    @Test
    public void testSquare(){
        Square square =(int x)-> x*x;
        Assertions.assertEquals(36,square.findSquare(6));
    }
}
