package com.way2it.lesson2.string;

import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num of the symbols: ");
        int n = sc.nextInt();
        String str = " ";
        if (n > 0 && n % 2 == 0){
            System.out.println("two indexes: ");
            String c1 = sc.next();
            String c2 = sc.next();
            for (int i = 1; i < n; i++){
                if (i % 2 != 0){
                    str = str+c1;
                }else {str = str + c2;}
            } System.out.println(str);

        }
    }
}
