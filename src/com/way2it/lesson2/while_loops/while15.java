package com.way2it.lesson2.while_loops;
import java.util.Scanner;

public class while15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int k = 1000;
        int m = 0;
        if (0 < p && p < 25) {
            while (k<=1100){
                k = k + (p *(k/100));
                m++;
            }
        }else {
            System.out.println("error");
        }
        System.out.println("in "+m+" month you will have "+k+" money");
    }
}
