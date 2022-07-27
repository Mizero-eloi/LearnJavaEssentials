package com.eloi;

import java.util.Arrays;

public class LoopsDemo {
    public  static  void main(String[] args){
        // Loops

        int[] numbers = {2,0,1,4,100,4,90, 78, 77};
        String[] names = {"Anna", "Ali"};


        System.out.println("Printing the array using pro tips: ");

        Arrays.stream(numbers).forEach(System.out::println);
        Arrays.stream(names).forEach(System.out::println);

        for (int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // Enhanced for loop
        System.out.println("Enhanced for loop");
        for(int number : numbers){
            System.out.println(number);
        }

        for(String name : names){
            System.out.println(name);
        }






    }
}
