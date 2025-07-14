package com.java.workshop.temdata.basic.bean;
public class Towdimi {
    public static void main(String[] args) {
        Integer[][] Employe=new Integer[5][2];
        Employe[0][0]=1;
        Employe[0][1]=50000;
        Employe[1][0]=2;
        Employe[1][1]=60000;
        Employe[2][0]=3;
        Employe[2][1]=70000;
        Employe[3][0]=4;
        Employe[3][1]=80000;
        Employe[4][0]=5;
        Employe[4][1]=90000;
        System.out.println("Emmplye ID \t salary");
        for(int i=0;i<Employe.length;i++){
            System.out.println(Employe[i][0]+ "\t" +Employe[i][1]);
        }
    }
}
