package com.way2it.lesson2;

import java.util.Scanner;

public class Integer17_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            a = sc.nextInt();
            if (a < 999){ a = 0; }
            int first = a/1000;
            int second = (a/100)%10;

            System.out.println("hundreds: "+second+" thousands: "+first);
        }
    }
}


