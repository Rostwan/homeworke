package com.way2it.lesson2.loops_for;
import java.util.Scanner;
public class for16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num:");
        float a = sc.nextFloat();
        System.out.println("power:");
        float n = sc.nextFloat();
        float i = 1;
        if (n > 0) {
            for (i = 1; i <= n; i++) {
                System.out.println(Math.pow(a,i));
            }
        } else {System.out.println("error");}
    }
}
