package com.way2it.lesson2.array;

import java.util.Scanner;

public class arrays9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mas = 0;
        int sum = 0;
        int arr[] = new int[n];
        for (int i = 0; i <arr.length; i++){
            arr[i]= sc.nextInt();
            if (arr[i] % 2 == 0){
               mas = arr[i];
               sum = arr[i]+sum;
                System.out.println("четные элементы = " + mas);
            }
        } System.out.println("Sum = "+sum);

    }
}



