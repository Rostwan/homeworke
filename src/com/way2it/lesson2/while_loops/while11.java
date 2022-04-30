package com.way2it.lesson2.while_loops;
import java.util.Scanner;

public class while11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int k1 = 0;
        if (n > 1) {
            while (k <= n) {
                k1++;
                k = k1+k;
                k1++;
            }
            System.out.println("last num: "+k1--);
            System.out.println("sum: "+k);
        }
    }
}
