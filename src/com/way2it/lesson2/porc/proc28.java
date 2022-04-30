package com.way2it.lesson2.porc;

import java.util.Scanner;
import java.util.stream.IntStream;

public class proc28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("write 10 nums: ");
        boolean k = true;

        for (int i = 1; i <= 10; i++){
            int n1 = s.nextInt();
            System.out.println(IsPrime(n1));

        }

    }

    private static boolean IsPrime(int k ) {
            return IntStream.rangeClosed(2,k/2).anyMatch( i -> k % i == 0);
        }


    }



