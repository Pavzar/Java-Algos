package com.company;

public class Main {

    public static void main(String[] args) {
        getLargestNumber(21);
    }

    public static int getLargestNumber(int number) {
        if (number < 0 || number <= 1) {
            return -1;
        }

        int largestPrime = 2;

        while (largestPrime < number) {
            if (number % largestPrime != 0) {
                largestPrime++;
            } else {
                number = number / largestPrime;
            }
        }
        return number;


    }
}
