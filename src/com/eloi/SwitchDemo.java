package com.eloi;

public class SwitchDemo {
    public static void main(String[] args){
        // Switch Statement

        String gender = "FEMALE";

        if (gender.equals("FEMALE")){

        } else if (gender.equals("MALE")){

        } else if (gender.equals("PREFER_NOT_TO_SAY")){

        }

        switch (gender.toUpperCase()){
            case "FEMALE":
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println("I am a male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("PREFER_NOT_SAY");
                break;
            default:
                System.out.println("Unknown gender");
        }
    }
}
