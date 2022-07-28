package com.way2it.lesson2;

import java.util.Scanner;

public class Boolean15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a > 0 && b > 0 || a > 0 && c > 0 || b > 0 && c > 0) {
                System.out.println("it is true");
            }else {
                System.out.println("it is false");
            }
        }
    }
}