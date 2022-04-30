package com.way2it.lesson2.while_loops;
import java.util.Scanner;
public class while4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0){
            while (n > 3) {
                n = n / 3;}
                if (n == 3){
                    System.out.println(true);
                }else {
                    System.out.println(false);
                }
            }
        else {
            System.out.println("error");
        }
        System.out.println();
    }
}



