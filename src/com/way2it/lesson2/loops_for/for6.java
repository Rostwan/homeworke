package com.way2it.lesson2.loops_for;
import java.util.Scanner;
public class for6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1kilo price:");
        int a = sc.nextInt();
        float i = 0;
        for (i = a; i <= 10 * a; i++){
            System.out.println(0.1*i*a+1);
        }
    }
}
