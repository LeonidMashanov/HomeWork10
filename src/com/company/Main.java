package com.company;

public class Main {
    public static void printElementsRightUpAndLeftDown (int [][]arr){
       System.out.println(arr[0][arr.length-1]);
        System.out.println(arr[arr.length-1][0]);
        return;
    }
    public static void printElements5LineAnd2Column(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[5][i]);
        }
    }
    public static void main(String[] args) {
	int [][] array= new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int ran = (int) (10*Math.random()*1);
                array[i][j]= ran ;
            }
        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                System.out.println(array[i][j]+"\t");
//
//            }
//
//        }
     printElementsRightUpAndLeftDown(array);
        printElements5LineAnd2Column(array);




    }
}
