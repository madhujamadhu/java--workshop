package com.java.workshop.collection.basic.bean.strings;

public class Calculatordate {
    public int add(int a,int b){
        return a+b;
    } 
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        if(b==0){
            throw new ArithmeticException("Dividion by zero is not allowed");
        }else{
            return a/b;
        }
    }
    public static void main(String[] args) {
        Calculatordate calculator=new Calculatordate();
        System.out.println("Addition:"+calculator.add(5,8));
        System.out.println("subtraction:"+calculator.sub(8,4));
        System.out.println("multiplication:"+calculator.mul(5,9));
        System.out.println("division:"+calculator.div(6,9));


    }
    
    
}
