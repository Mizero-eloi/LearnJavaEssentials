package com.eloi;

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name: ");
        String username = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        int birthYear = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + birthYear);


        if(age < 18){
            System.out.println("You can not vote");
        } else {
            System.out.println("You can vote :) ");
        }



        System.out.println("hello " + username);

    }
}
