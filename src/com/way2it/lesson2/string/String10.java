package com.way2it.lesson2.string;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num of the symbols: ");
        String n = sc.nextLine();
        StringBuilder m = new StringBuilder();
        for (int i = n.length() - 1; i >= 0 ; i--){
            m.append(n.charAt(i));
        }
        System.out.println(m);
    }
}



