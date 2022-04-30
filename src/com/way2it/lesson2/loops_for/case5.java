package com.way2it.lesson2.loops_for;
import java.util.Scanner;
public class case5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("action:");
        int action = sc.nextInt();
        System.out.println("write 2 numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        switch (action){
         case 1 -> System.out.println((A+B));
         case 2 -> System.out.println((A-B));
         case 3 -> System.out.println((A*B));
         case 4 -> System.out.println((A/B));
            default -> System.out.println("error;");
        }
    }
}