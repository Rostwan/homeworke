package com.way2it.lesson2.while_loops;
import java.util.Scanner;
public class while1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A > B){
                 while (A >= B) {
                     A = A-B;
                 }
                System.out.println(A);
            }else {
                System.out.println("error");
            }
    }
}


