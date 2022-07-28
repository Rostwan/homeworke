package com.way2it.lesson2.loops_for;
import java.util.Scanner;
public class for1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int i = 0;
        if(n > 0) {
            for (i = 0; i < n; i++) {
                System.out.println(k);
            }
        }else {
            System.out.println("error");
        }

    }
}

