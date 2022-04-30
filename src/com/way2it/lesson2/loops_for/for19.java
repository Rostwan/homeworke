package com.way2it.lesson2.loops_for;
import java.util.Scanner;
public class for19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float i = 1;
        double sum = 1;
        if (n > 0) {
            for (i = 1; i <= n; i++) {
                sum = sum * i;
            }
            System.out.println(sum);
        }else {
            System.out.println("error");
        }
    }
}

