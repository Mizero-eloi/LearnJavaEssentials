package com.eloi;

import java.time.LocalDate;

public class PassportDemo {

    public static void main(String [] args ){
        // Classes

        Passport ukPassport = new Passport("1234", "England", LocalDate.of(2035, 2, 8));

    }

    static class Passport{
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate){
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}
