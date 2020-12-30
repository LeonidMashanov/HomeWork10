package com.company;

import java.util.Arrays;

public class Main {
    /**
     * Дан двумерный массив. Вывести на экран элемент, расположенный в правом верхнем углу массива и элемент в левом нижнем углу массива.
     * @param arr
     */
    public static void printElementsRightUpAndLeftDown(int[][] arr) {
        System.out.println(arr[0][arr.length - 1]+"\t");
        System.out.println(arr[arr.length - 1][0]+"\t");
        return;
    }

    /**
     * Дан двумерный массив. Вывести все элементы 5-й строки. Вывести элементы 2-го столбца массива.
     * @param arr
     */
    public static void printElements5LineAnd2Column(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[arr.length-1][i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][1]+"\t");
        }
        System.out.println("\n");
    }


    /**
     *Вывести на экран строку, сумма элементов которой будет максимальна. (дан двумерный массив любого размера).
     * @param array
     */
    public static void randomNumbersForArrayAndSum(int[][] array) {
                int sum=0;
               for (int i = 0; i < array.length; i++) {
                   for (int j = 0; j < array.length; j++) {
                       int r = (int) (Math.random() * (10 - 1) + 1);
                       array[i][j] = r;
                       sum+=r;
                   }

                       } for (int i = 0; i < array.length; i++) {
                           for (int j = 0; j < array.length; j++) {
                               System.out.print(array[i][j] + " \t");


                   } System.out.println("\n");
               }System.out.println("сумма значений масива = "+sum);

    }

    /**
     * Вывести на экран строку, сумма элементов которой будет максимальна. (дан двумерный массив любого размера)
     * @param arr
     */
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

    /**
     *используя датчик случайных чисел, заполнить двумерный массив не повторяющимися числами. (диапазон 1 - 10)
     * @param numbers
     * @param num
     * @return
     */
    private static boolean matchCheck(int[] [] numbers, int num) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i][j] == num);
                return true;
            }
        }
        return false;
    }
    public static int numberSearchInArray(int[][]arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == num) ;
                return arr[i][j];
            }
        }
        return num;
    }
    public static void randomNumbersNotRepeating(int [][] arr){
        int rangeMin=1;
        int rangeMax=10;
        int diff = rangeMax - rangeMin;
        int tmp=0;

        for (int i = 0; i < arr.length; i++) {
            int r = 0;
            for (int j = 0; j < arr.length; j++) {
                r = (int) ( Math.random() * (rangeMax-rangeMin)+rangeMin);
                if(tmp==r) continue;
                arr[i][j] = r;
                tmp = r;
                while (matchCheck(arr, r)) {
                    int num =numberSearchInArray(arr,r);
                          num  = (int) (Math.random() * (rangeMax-rangeMin)+rangeMin);
                    arr[i][j] = num;
                    if(matchCheck(arr, r))break;
                }
            }
        }


    }
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        randomNumbersNotRepeating(array);
//        randomNumbersForArrayAndSum(array);
//        printElements5LineAnd2Column(array);
//        printElementsRightUpAndLeftDown(array);
//        sumMaxLineOfArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+" \t");

            }
            System.out.println("\n");
        }



    }
}
