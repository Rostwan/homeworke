package com.way2it.lesson2.array;

import java.util.Scanner;

public class arrays7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = arr.length-1;i >= 0; i--){
            arr[i]= sc.nextInt();
            System.out.println(arr[i]+" ");
        }
    }
}


