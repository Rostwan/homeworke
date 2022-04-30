package com.way2it.lesson2;

import java.util.Scanner;

public class Integer19_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            a = sc.nextInt();//seconds
            if (a > 86400){
                System.out.println("in 24 hours 86400 seconds");
                a = 0;
            }
            int b = (a/60);//minutes
            int hours = a/3600;
            int last_min = a % 60;
            int last_hour = a % 3600;
            int last_hour_m = (int) (b % 60);
            System.out.println("in "+a+" seconds "+b+" minutes or "+hours+" hours");
            System.out.println("since last minute "+last_min+" seconds");
            System.out.println("since last hour "+last_hour+" seconds");
            System.out.println("since last hour "+last_hour_m+" minutes");
        }
    }
}

