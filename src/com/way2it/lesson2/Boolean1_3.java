package com.way2it.lesson2;

import java.util.Scanner;

public class Boolean1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            a = sc.nextInt();
            if (a > 0){
                System.out.println("Число положительное");
            }else System.out.println("число отрицательное");
            if ((a % 2) == 0){
                System.out.println("Число является четным");
            }else System.out.println("Число являеться не четным");
        }
    }
}
