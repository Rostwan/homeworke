package com.way2it.lesson2.array;

import java.util.Scanner;

public class matrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = 3;
        int m = 3;
            int [][]arr = new int[n][m];
            int [][]arr1 = new int[n][m];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j]= sc.nextInt() ;
                    if (j > 0){
                        arr[i][j] *=5;
                    }
                    //arr[i][0] = sc.nextInt()*10;
                    //arr[0][j] = sc.nextInt();
                   // arr[i][j] = arr1[i][j];
                }
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //arr[i][j]= arr[i][j] * arr1 [i][j];
                System.out.print(arr[i][j] + "\t");
            }
        }
    }
}






