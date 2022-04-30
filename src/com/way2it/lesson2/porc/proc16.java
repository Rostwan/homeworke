package com.way2it.lesson2.porc;

import java.util.Scanner;

public class proc16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("write 3 radius: ");
        double c1 = s.nextDouble();
        double c2 = s.nextDouble();
        double c3 = s.nextDouble();
        double first = CircleS(c1);
        double second = CircleS(c2);
        double third = CircleS(c3);
        System.out.println("first radius= "+first+" second "+second+" third= "+third );
    }
    private static double CircleS (double R ){
        return 3.14*R*R;
    }
}
