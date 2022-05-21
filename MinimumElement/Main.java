package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        findMin(readElements(readInteger()));
    }


    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        return size;
    }

    private static int[] readElements(int size) {
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }


    private static int findMin(int[] array) {

        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < minValue) {
                minValue = value;
            }
        }

        System.out.println(minValue);
        return minValue;
    }


}
