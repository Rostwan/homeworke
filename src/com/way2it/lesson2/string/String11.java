package com.way2it.lesson2.string;

import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num of the symbols: ");
        String n = sc.nextLine();
        StringBuilder m = new StringBuilder();
        for (int i = 0; i <= n.length()-1; i++){
            m.append(n.charAt(i)).append(" ");
        }
        System.out.println(m);
    }
}



