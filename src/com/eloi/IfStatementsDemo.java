package com.eloi;

public class IfStatementsDemo {
    public static void main(String[] args){
        // If statements

        int age = 15;

        if (age >= 18){
            System.out.println("Adult");
        } else if (age >= 16 && age < 18){
            System.out.println("I am almost an adult");
        }else {
            System.out.println("Not adult");
        }

        // Ternary operator

        String message = age >= 18 ? "Hooray... I am an adult" : "I am not an adult";
        System.out.println(message);
    }
}
