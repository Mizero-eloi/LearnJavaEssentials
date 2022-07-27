package com.eloi;

public class LogicalOpsDemo {
    public static void main (String[] args){
        // Logical operators

        boolean isAdult = false;
        boolean isStudent = false;
        boolean isMember = true;

        System.out.println((!isAdult || isStudent) && !isMember);

        String name = "Mark";

        System.out.println(!isAdult);
        System.out.println((10 > 8 || 2 <= 2) && !isAdult && name.contains("M"));
    }
}
