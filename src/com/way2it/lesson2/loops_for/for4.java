package com.way2it.lesson2.loops_for;
import java.util.Scanner;
public class for4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1kilo price:");
        int a = sc.nextInt();
        int i = 0;
        for (i = a; i <= 10 * a; i++){
            System.out.println(i*a);
        }
    }
}
