package com.way2it.lesson2.porc;

import java.util.Scanner;

public class Recur10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int  a = scanner.nextInt();
        int sum = 0;
        int c = DigitSum(a,sum);
        System.out.println(c);
    }

    private static int DigitSum(int K,int sum) {
        if (K==0){
            return sum;
        }else {
            sum +=K;
            K--;
            return DigitSum(K,sum);
        }
    }
}





