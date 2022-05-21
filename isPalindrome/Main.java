package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-7077));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int numberCopy = number;
        int reverse = 0;
        while (numberCopy > 0) {
            int lastDigit = numberCopy % 10;
            reverse = reverse * 10 + lastDigit;
            numberCopy /= 10;
        }
        if (number == reverse) {
            return true;
        }

        return false;
    }
}
