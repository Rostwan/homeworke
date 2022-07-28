package com.way2it.lesson2.while_loops;
import java.util.Scanner;
public class while3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
            while (n >= k) {
                n = n - k;
                sum++;
            }
            System.out.println("result: "+sum+ " balance "+n);
    }
}



