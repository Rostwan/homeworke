package com.way2it.lesson2.porc;

import java.util.Scanner;

public class Recur1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double fact = 1;
        int i = 1;
        double n = scanner.nextDouble();

        double c = Fact(n,fact,i);
        System.out.println(c);
    }
    private static double  Fact(double n,double fact,int i){
        if (i == n || n == 0){
            return fact;
        }else {
            i++;
            fact = fact*i;
            return Fact(n,fact,i);

        }
    }
}

