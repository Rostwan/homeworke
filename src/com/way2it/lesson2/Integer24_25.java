package com.way2it.lesson2;

import java.util.Scanner;

public class Integer24_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            System.out.println("write down number of the day of the week of the first January: 0-monday, 6-sunday: ");
            int b = sc.nextInt();
            System.out.println("num of the day: ");
            a = sc.nextInt();
            if (a > 365 || a < 0){
                System.out.println("there is 365 days in a year, try another variant ");
            a = 0;
            }
            int day = (a+b) % 6;
            if (day == 0){
                System.out.println("It is sunday");
            } else if (day == 1){
                System.out.println("It is monday");
            }else if (day == 2){
                System.out.println("It is tuesday");
            }else if (day == 3){
                System.out.println("It is wednesday");
            }else if (day == 4){
                System.out.println("It is thursday");
            }else if (day == 5){
                System.out.println("It is friday");
            }else if (day == 6){
                System.out.println("It is saturday");
            } else System.out.println("smthg went wrong, srry");

        }
    }
}
