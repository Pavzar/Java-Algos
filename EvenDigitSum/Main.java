package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1034));
    }

    public static int getEvenDigitSum(int number) {

        int sum = 0;

        if (number < 0) {
            return -1;
        }

        while (number > 0) {
            int lastDigit = number % 10;
            if (number % 2 == 0) {
                sum += lastDigit;
            }
            number /= 10;
        }
        return sum;
    }
}
