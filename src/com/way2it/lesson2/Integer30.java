package com.way2it.lesson2;

import java.util.Scanner;

public class Integer30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            a = sc.nextInt();
            int b = 0;
            int first = a/100;
            int second = a%100;
            int third = a%10;
            if (second == 0 && third == 0) {
            b = first;
            }else {
                b = first+1;
            }
            System.out.println(a+" year is a "+b+" sanctuary");
        }
    }
}
