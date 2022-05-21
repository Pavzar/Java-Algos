package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameDigit(41,22,72));
        System.out.println(hasSameDigit(23,32,42));
        System.out.println(hasSameDigit(9,99,999));
        System.out.println(isValid(1023));
    }

    public static boolean hasSameDigit(int numberOne, int numberTwo, int numberThree) {
        if (numberOne < 10 || numberTwo < 10 || numberThree < 10 || numberOne > 1000 || numberTwo > 1000 || numberThree > 1000) {
            return false;
        }

        int rightmostDigitOne, rightmostDigitTwo, rightmostDigitThree;
        rightmostDigitOne = numberOne % 10;
        rightmostDigitTwo = numberTwo % 10;
        rightmostDigitThree = numberThree % 10;

        if ((rightmostDigitOne == rightmostDigitTwo) || (rightmostDigitOne == rightmostDigitThree) || (rightmostDigitTwo == rightmostDigitThree)) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number){
        if(number < 10 || number > 1000){
            return false;
        }
        return true;
    }



}


