package com.way2it.lesson2;

import java.util.Scanner;

public class Boolean17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            a = sc.nextInt();
            if ((a % 2) != 0 && a/100 > 0){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }
    }
}
