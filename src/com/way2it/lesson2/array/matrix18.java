package com.way2it.lesson2.array;

import java.util.Arrays;
import java.util.Scanner;

public class matrix18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int multiply = 1;
        int n = 3;
        int m = 3;
        System.out.println("num of the column to sum up and multiply");
        int k = sc.nextInt();
        int[][] arr = new int[n][m];
        int[][] arr1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                if (i == k) {
                    sum += arr[i][j];
                    multiply *= arr[i][j];
                }
            }
        }
        Arrays.stream(arr)
                .forEach(a -> System.out.println(Arrays.toString(a)));
        //System.out.println(Arrays.deepToString(arr));
        System.out.println("sum of the "+k+" column= "+sum+" and res of multiplying = "+multiply);
    }
}







