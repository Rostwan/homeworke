package com.way2it.lesson2;
import java.util.Scanner;
public class Integer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a!=0) {
            System.out.println("Число А=");
             a = sc.nextInt();
            System.out.println("Число B=");
             int b = sc.nextInt();
             int div = (a/b);
            System.out.println("В число "+a+" помещаеться "+div+"*B");
        }
    }
}
