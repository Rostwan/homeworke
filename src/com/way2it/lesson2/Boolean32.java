package com.way2it.lesson2;

import java.util.Scanner;

public class Boolean32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a*a + b*b == c*c){
                System.out.println("Триугольник прямоугольний");
            }else System.out.println("триугольник не прямоугольний");
        }
    }
}
