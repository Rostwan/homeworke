package com.way2it.lesson2.array;

import java.util.Arrays;
import java.util.Scanner;

public class matrix1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();
            int [][]arr = new int[n][m];
            int [][]arr1 = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j]= sc.nextInt();
                    //arr[i][0] = sc.nextInt()*10;
                    //arr[0][j] = sc.nextInt();
                    arr1[i][0] = 10;
                }
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]= arr[i][j] * arr1 [i][j];
                System.out.print(arr[i][j] + "\t");

            }
        }
    }
}






