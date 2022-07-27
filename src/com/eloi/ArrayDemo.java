package com.eloi;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args){
        // Arrays
        int zero = 0;
        int one = 1;

        int []  myNumbers = {1,2,3,4};
        String [] names = {"Ali", "Maria"};

        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);

    }
}
