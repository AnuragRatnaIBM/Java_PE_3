/*
3. Write a java program to calculate first and last date of a week.
Output:
First Date of Week: Mon 24/07/2017
Last date of the week: Sun 30/07/2017
 */

package com.stackroute.practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstAndLastDay {

    public static  String checkFirstAndLastDay()
    {
        String temp="";
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
        temp=temp+dateFormat.format(calendar.getTime());
        for (int i = 0; i < 6; i++) {
            calendar.add(Calendar.DATE, 1);
        }
        temp=temp+"\n"+dateFormat.format(calendar.getTime());
        return temp;
    }



}
