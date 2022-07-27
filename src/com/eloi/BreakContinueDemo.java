package com.eloi;

public class BreakContinueDemo {
    public static void main(String[] args){
        // Break and Continue

        String[] names = {"Anna", "Ali", "Bob", "Mike"};

        System.out.println("================== Break ================== ");

        for (String name : names){
            System.out.println(name);
            break;
        }


        System.out.println("================== Continue ================== ");

        for (String name : names) {
            if(name.startsWith("A")){
                continue;
            }

            System.out.println(name);

        }

    }
}
