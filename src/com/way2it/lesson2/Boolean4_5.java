package com.way2it.lesson2;

import java.util.Scanner;

public class Boolean4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a != 0) {
            a = sc.nextInt();
            int b = sc.nextInt();
            if (a > 2 && b <= 3){
                System.out.println("Число А > 2 , а число Б <= 3");
            }else {
                System.out.println("неравенство не справедливо");
            }
        }
    }
}
