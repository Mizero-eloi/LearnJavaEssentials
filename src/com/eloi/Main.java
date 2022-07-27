package com.eloi;

public class Main {

    public static void main(String [] args ){
        // Classes and Objects

        Lens lensOne = new Lens("sony", "85mm", true);
        Lens lensTwo = new Lens("sony", "30mm", true);
        Lens lensThree = new Lens("canon", "24-70mm", false);

        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);

    }

    static class Lens{
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime){
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }


    }



}
