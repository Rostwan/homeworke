package com.way2it.lesson2;

import java.util.Scanner;

public class Integer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            a = sc.nextInt();
            int first = (a/10);
            int scnd = ((a%10)*10);
            System.out.println(scnd+first);
        }
    }
}
