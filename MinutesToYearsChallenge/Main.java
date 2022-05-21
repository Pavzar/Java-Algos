package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(1440 );
    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0 ){
            System.out.println("Invalid value");
        }

        long years = minutes / 525600;
        long remainingMinutes = minutes % 525600;
        long days = remainingMinutes / 1440;
        System.out.println(years);
        System.out.println(days);
    }



}
