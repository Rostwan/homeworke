package com.way2it.lesson2.loops_for;
import java.util.Scanner;
public class for2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;
        if(a < b) {
            for (i = a; i <= b; i++){
                System.out.println(i);
            }
        }else {
            System.out.println("error");
        }
        System.out.println((b-a));

    }
}

