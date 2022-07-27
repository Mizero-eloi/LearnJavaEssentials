package com.eloi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class ImportsDemo {
    public static void main (String[] args){
        Date date = new Date();
        java.sql.Date newDate = new java.sql.Date(1);

        String name = new String("eloi");

        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

    }

}
