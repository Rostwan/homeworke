package com.way2it.lesson2.array;

import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = 0;
        int [] array1 = new int[p];
        for (int i = 0; n < array1.length; i++){
            if (i % 2 != 0){
                array1[n] = i;
                n++;
                System.out.println(i);
            }
        }
    }
}
