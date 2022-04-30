package com.way2it.lesson2.porc;

import java.util.Scanner;

public class proc22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("write 3 radius: ");
        double c1 = s.nextDouble();
        double c2 = s.nextDouble();
        int c3 = s.nextInt();
        double c = Calc(c1, c2,c3);
        System.out.println(c);

    }

    private static double Calc(double A, double B, int Op) {
        return switch (Op) {
            case 1 -> (A - B);
            case 2 -> (A * B);
            case 3 -> (A / B);
            default -> (A + B);
        };

    }
}


