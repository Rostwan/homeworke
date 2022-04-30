package com.way2it.lesson2.string;

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("first symbol is: " + str.charAt(0));
        System.out.println("last symbol is: " + str.charAt(str.length()-1));
    }
}
