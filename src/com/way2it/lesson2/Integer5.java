package com.way2it.lesson2;
import java.util.Scanner;

public class Integer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = 1;
        while (a!=0) {
            a = sc.nextFloat();
            float b = sc.nextFloat();
            float div = (a%b);
            System.out.println("остаток= "+div);
        }
    }
}
