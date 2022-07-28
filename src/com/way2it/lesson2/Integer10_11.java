package com.way2it.lesson2;

import java.util.Scanner;

public class Integer10_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            a = sc.nextInt();
            int frst = (a / 100);
            int scnd = ((a / 10) % 10);
            int thrd = ((a % 100) % 10);
            System.out.println((thrd*10+scnd));
            System.out.println("sum= " + (frst + scnd + thrd) + " multiply= " + (frst * scnd * thrd));
        }
    }
}
