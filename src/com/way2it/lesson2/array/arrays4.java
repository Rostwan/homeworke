package com.way2it.lesson2.array;

import java.util.Scanner;

public class arrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length:");
        double p = sc.nextInt();
        System.out.println("multiplier: ");
        double d = sc.nextInt();
        System.out.println("first number: ");
        double a = sc.nextInt();
        double pow = 0;
        double n = 0;
        double[] arr = new double[(int) p];
            for (double i = 0; i < arr.length; i++){
            n = a * Math.pow(d,pow);
            pow++;
            arr[(int) i] = n;
            a = n;
            System.out.println(arr[(int) i]);
        }
    }

}
