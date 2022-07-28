package com.way2it.lesson2.array;

import java.util.Scanner;

public class matrix3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = 3;
        int m = 3;
        int[][] arr = new int[n][m];
        int[][] arr1 = new int[n][m];
        for (int j = 0; j < arr1.length; j++){
                arr1[0][j] = sc.nextInt();
            }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = arr1[0][j];
                System.out.print(arr[i][j] + "\t");
            }
            //for (i = 0; i < arr[i].length; i++) {
              //  for (int j = 0; j < m; j++) {
                //    System.out.print(arr[i][j] + "\t");
                //}
            //}
        }
    }
}






