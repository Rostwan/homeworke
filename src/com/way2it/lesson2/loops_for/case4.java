package com.way2it.lesson2.loops_for;
import java.util.Scanner;
public class case4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("month's number:");
        int month = sc.nextInt();
        switch (month){
            case 1 -> System.out.println("31 days");
            case 2 -> System.out.println("28 days");
            case 3 -> System.out.println("31");
            case 4 -> System.out.println("30");
            case 5 -> System.out.println("31 ");
            case 6 -> System.out.println("30 ");
            case 7 -> System.out.println("31 ");
            case 8 -> System.out.println("31 ");
            case 9 -> System.out.println("30 ");
            case 10 -> System.out.println("31 ");
            case 11 -> System.out.println("30 ");
            case 12 -> System.out.println("31 ");
            default -> System.out.println("error");
        }

    }
}
