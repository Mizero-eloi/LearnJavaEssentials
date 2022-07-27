package com.eloi;

public class PrimitiveAndReference {
    public static void main (String[] args){

        // Primitive types
        int a = 10;
        int b = a;

        a = 100;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("Before changing alex");
        System.out.println("alex: " + alex.name);
        System.out.println("mariam: " + mariam.name);

        alex.name = "Alexander";

        System.out.println("after changing alex");
        System.out.println("alex: " + alex.name);
        System.out.println("mariam: " + mariam.name);

    }

    static class Person{
        String name;

        Person(String name){
            this.name = name;
        }
    }
}
