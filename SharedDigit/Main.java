package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
    }

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if (numberOne < 10 || numberTwo < 10 || numberOne > 99 || numberTwo > 99) {
            return false;
        }

        int lastDigitOfNumberOne, lastDigitOfNumberTwo, firstDigitOfNumberOne, firstDigitOfNumberTwo;

        while (numberOne > 0 && numberTwo > 0) {
            lastDigitOfNumberOne = numberOne % 10;
            lastDigitOfNumberTwo = numberTwo % 10;
            numberOne /= 10;
            numberTwo /= 10;
            firstDigitOfNumberOne = numberOne;
            firstDigitOfNumberTwo = numberTwo;

            return ((firstDigitOfNumberOne == firstDigitOfNumberTwo) || (firstDigitOfNumberOne == lastDigitOfNumberTwo) || (lastDigitOfNumberOne == firstDigitOfNumberTwo) || (lastDigitOfNumberOne == lastDigitOfNumberTwo));

        }

        return false;

    }
}
