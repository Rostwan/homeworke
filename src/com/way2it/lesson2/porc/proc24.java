package com.way2it.lesson2.porc;

import java.util.Scanner;

public class proc24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("write 10 nums: ");

        for (int i = 1; i <= 10; i++){
            int n1 = s.nextInt();
            boolean n = Even(n1);
            System.out.println(n);

        }

    }

    private static boolean Even(int k ) {
        if (k % 2 == 0 ){
            return true;
        } else {
            return false;
        }


    }
}


