package com.eloi;


import java.time.LocalDate;
import java.util.Date;

public class HelloWorld {
    public static void main(String [] args){
        // This prints to console

        // primitive types
//        int number = 10;
//        double decimal = 100.01;
//        byte theByte = -128;
//        short theShort = 8_989;
//        long theLong = 78_783_833_432L;
//        float pi = 3.14F;
//        double doublePi = 3.1415;

//        boolean isAdult = true;
//        char name = 'A';
//        String brand = "eloi";
//        System.out.println(number);
//        System.out.println(decimal);
//        System.out.println(isAdult);
//        System.out.println(theByte);
//        System.out.println(theShort);
//        System.out.println(pi);
//        System.out.println(doublePi);
//        System.out.println(name);
//
//        Date date = new Date();
//
//        System.out.println(date);

        // Non primitive data types AKA reference types

        String name = new String("Eloi MIZERO");

        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(name.toUpperCase());


    }
}
