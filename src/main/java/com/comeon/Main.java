package com.comeon;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String args[]){
        Date date = new Date();

        System.out.println(date);

        Calendar ddate2 = new GregorianCalendar();

        System.out.println(ddate2.getTime());
    }
}
