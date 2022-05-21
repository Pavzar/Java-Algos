package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(0);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("Zero");
        }


        int reverseNumber = reverse(number);
        int countReverseNumber = getDigitCount(reverseNumber);
        int countNumber = getDigitCount(number);


        while (reverseNumber > 0) {
            int lastDigit = reverseNumber % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverseNumber /= 10;
        }
        if (countNumber != countReverseNumber) {
            int zeroCounter = countNumber - countReverseNumber;
            while (zeroCounter > 0) {
                System.out.println("Zero");
                zeroCounter--;
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int numberCopy = number;
        if (number < 0) {
            number = Math.abs(number);
            numberCopy = number;
            while (numberCopy > 0) {
                int lastDigit = numberCopy % 10;
                reverse = reverse * 10 + lastDigit;
                numberCopy /= 10;
            }
            return reverse * -1;
        }

        while (numberCopy > 0) {
            int lastDigit = numberCopy % 10;
            reverse = reverse * 10 + lastDigit;
            numberCopy /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 1;

        for (int i = count; number > 0; i++) {
            number /= 10;
            count = i;
        }
        return count;

    }
}
