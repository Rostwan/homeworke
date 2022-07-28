package com.way2it.lesson2.while_loops;
import java.util.Scanner;
public class while2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;
        if (A > B){
            while (A >= B) {
                A = A-B;
                sum++;
            }
            System.out.println(sum);
        }else {
            System.out.println("error");
        }
    }
}


