package com.way2it.lesson2;

import java.util.Scanner;

public class Integer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a!=0) {
            System.out.println("Запиши количевство см:");
            a = sc.nextInt();
            int meters = (a / 100);
            System.out.println("в " + a + " сантиметрах есть " + meters + " м");
        }
    }
}
