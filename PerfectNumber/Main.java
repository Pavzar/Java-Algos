package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(33550336));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
                System.out.println(sum);
            }
        }
        if (sum == number) {
            return true;
        }
        return false;
    }


}
