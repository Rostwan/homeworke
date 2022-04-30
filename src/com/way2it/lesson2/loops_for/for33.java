package com.way2it.lesson2.loops_for;
import java.util.Scanner;
public class for33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float n0 = 1;
        float n1 = 1;
        float n2;
        double i = 0;
        if (n > 1) {
            for (i = 3; i <= n+2; i++) {
                n2 = n1 + n0;
                System.out.println(n2+" ");
                n0 = n1;
                n1 = n2;
            }
            System.out.println();
        }else {
            System.out.println("error");
        }
    }
}

