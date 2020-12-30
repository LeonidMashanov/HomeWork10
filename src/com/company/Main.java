package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void printElementsRightUpAndLeftDown(int[][] arr) {
        System.out.println(arr[0][arr.length - 1]);
        System.out.println(arr[arr.length - 1][0]);
        return;
    }

    public static void printElements5LineAnd2Column(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[4][i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][1]);
        }
    }



    public static void randomNumbers(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int ran = (int) (10 * Math.random() * 1);
                for (int k = 1; k < 10; k++) {

                    int num = (int) (10 * Math.random() * 1);


                }
                array[i][j] = ran;
            }
        }
    }
    public static void sumMaxLineOfArray(int[][] arr) {
        int tmp = 0;
        int index = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
                if (sum > maxSum) maxSum = sum;
                else {
                    maxSum = maxSum;
                }
            }
            if (maxSum > sum) {
                if (maxSum > sum && tmp != maxSum) {
                    index = i - 1;
                    tmp = maxSum;
                }
            }
        }
        System.out.println(Arrays.toString(arr[index]));

    }
    public static void main(String[] args) {
        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int ran = (int) (10 * Math.random() *1% 25);
                array[i][j]= ran ;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j]);

            }

        }



    }
}
