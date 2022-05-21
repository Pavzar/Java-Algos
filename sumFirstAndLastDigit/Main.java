package com.company;

public class Main {

    public static void main(String[] args) {
        sumFirstAndLastDigit(744);
    }

    public static int sumFirstAndLastDigit(int number) {


        int lastDigit;
        if (number >= 0) {
            lastDigit = number % 10;

            while (number > 9) {
                number = number / 10;
            }
            return number + lastDigit;
        } else

            System.out.println("-1");
        return -1;
    }


}
