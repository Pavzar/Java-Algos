package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {2,3,4,5,7,1};
        reverse(array);
    }

    private static void  reverse(int[] array){

        System.out.println("Array = " + Arrays.toString(array));

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));

    }

}
