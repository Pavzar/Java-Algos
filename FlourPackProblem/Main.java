package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(2, 1, 5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bCount = bigCount * 5;

        if (bCount + smallCount == goal) {
            return true;
        } else if ((bCount >= goal && bCount % goal == 0) || (bCount >= goal && goal % 5 <= smallCount)) {
            return true;
        } else if (smallCount >= goal) {
            return true;
        } else if (((bCount + smallCount) > goal) && ((goal % bCount) <= smallCount)) {
            return true;
        }
        return false;
    }
}
