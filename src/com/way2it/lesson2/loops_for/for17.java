package com.way2it.lesson2.loops_for;
import java.util.Scanner;
public class for17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float n = sc.nextFloat();
        float i = 1;
        double sum = 1;
        if (a > 0){
            for (i = 1 ; i <= n; i++){
                sum = sum +Math.pow(a,i);
            }
        }else {
            System.out.println("error");
        }
        System.out.println(sum);
    }
}