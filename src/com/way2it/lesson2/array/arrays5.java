package com.way2it.lesson2.array;

import java.util.Scanner;

public class arrays5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float n0 = 1;
        float n1 = 1;
        float n2;
        double i = 0;
        double[] arr = new double[(int) n];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        if (n > 2) {
            System.out.println(arr[0]+" "+arr[1]+
                    " "+arr[2]);
            for (i = 3; i <= n + 2; i++) {
                n2 = n1 + n0;
                arr[(int) i] = n2;
                System.out.println(n2);
                n0 = n1;
                n1 = n2;
            }

        } else {
            System.out.println("error");
        }
    }
}
