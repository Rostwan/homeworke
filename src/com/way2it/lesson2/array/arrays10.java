package com.way2it.lesson2.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class arrays10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        boolean sort = true;
        while (sort){
            sort = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                sort = true;
            }
        }
        }
        System.out.println(Arrays.toString(arr));
    }
}




