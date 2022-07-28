package com.way2it.lesson2.porc;

import java.util.Scanner;

public class Recur9 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int  a = scanner.nextInt();
        int  b = scanner.nextInt();
        int c = NOD(a, b);
        System.out.println(c);
    }

    private static int NOD(int A, int B) {
        if (A != 0 || B != 0) {
            if (A == B) {
                return A;

            }else if (A > B){
                A -= B;
                return NOD(A, B);
            }
            else {
                B -= A;
                return NOD(A, B);
            }
        } return A;
    }
}





