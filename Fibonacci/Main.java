package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        System.out.println("Enter first term");
        int firstTerm = scanner.nextInt();
        System.out.println("Enter second term");
        int secondTerm = scanner.nextInt();

        System.out.println("Fibonacci Series till " + n + " terms:");
        int i = 1;
        while (i <= n) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;
        }
    }
}
